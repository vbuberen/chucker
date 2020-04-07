package com.chuckerteam.chucker.internal.ui.transaction

import android.content.Context
import android.graphics.Bitmap
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemBodyLineBinding
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemHeadersBinding
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemImageBinding
import com.chuckerteam.chucker.internal.support.highlightWithDefinedColors
import com.chuckerteam.chucker.R

/**
 * Adapter responsible of showing the content of the Transaction Request/Response body.
 * We're using a [RecyclerView] to show the content of the body line by line to do not affect
 * performances when loading big payloads.
 */
internal class TransactionBodyAdapter(
    context: Context,
    private val bodyItems: List<TransactionPayloadItem>,
    private val onSearchDone: (ArrayList<Int>?) -> Unit
) : RecyclerView.Adapter<TransactionPayloadViewHolder>(), Filterable {

    private val backgroundSpanColorAll: Int = ContextCompat.getColor(context, R.color.chucker_color_primary)
    private val foregroundSpanColorAll: Int = ContextCompat.getColor(context, R.color.chucker_color_background)
    private val backgroundSpanColorCurrent: Int = ContextCompat.getColor(context, R.color.chucker_color_secondary)
    private val foregroundSpanColorCurrent: Int = ContextCompat.getColor(context, R.color.chucker_color_background)

    override fun onBindViewHolder(holder: TransactionPayloadViewHolder, position: Int) {
        holder.bind(bodyItems[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionPayloadViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_HEADERS -> {
                val headersItemBinding = ChuckerTransactionItemHeadersBinding.inflate(inflater, parent, false)
                TransactionPayloadViewHolder.HeaderViewHolder(headersItemBinding)
            }
            TYPE_BODY_LINE -> {
                val bodyItemBinding = ChuckerTransactionItemBodyLineBinding.inflate(inflater, parent, false)
                TransactionPayloadViewHolder.BodyLineViewHolder(bodyItemBinding)
            }
            else -> {
                val imageItemBinding = ChuckerTransactionItemImageBinding.inflate(inflater, parent, false)
                TransactionPayloadViewHolder.ImageViewHolder(imageItemBinding)
            }
        }
    }

    override fun getItemCount() = bodyItems.size

    override fun getItemViewType(position: Int): Int {
        return when (bodyItems[position]) {
            is TransactionPayloadItem.HeaderItem -> TYPE_HEADERS
            is TransactionPayloadItem.BodyLineItem -> TYPE_BODY_LINE
            is TransactionPayloadItem.ImageItem -> TYPE_IMAGE
        }
    }

    internal fun resetHighlight() {
        bodyItems.filterIsInstance<TransactionPayloadItem.BodyLineItem>()
            .withIndex()
            .forEach { (index, item) ->
                val spans = item.line.getSpans(0, item.line.length - 1, Any::class.java)
                if (spans.isNotEmpty()) {
                    item.line.clearSpans()
                    notifyItemChanged(index + 1)
                }
            }
    }

    override fun getFilter(): Filter = TransactionBodyFilter()

    inner class TransactionBodyFilter : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val matchingItemsPositions = arrayListOf<Int>()

            if (!constraint.isNullOrBlank() && constraint.length > 1) {
                bodyItems.filterIsInstance<TransactionPayloadItem.BodyLineItem>()
                    .withIndex()
                    .forEach { (index, item) ->
                        if (item.line.contains(constraint, ignoreCase = true)) {
                            val matchingRegex = (constraint as String).toRegex(RegexOption.IGNORE_CASE)
                            val occurrencesInItemLine = matchingRegex.findAll(item.line).count()
                            repeat(occurrencesInItemLine) {
                                matchingItemsPositions.add(index + 1)
                            }
                        }
                    }
            }
            return FilterResults().apply {
                values = matchingItemsPositions
                count = matchingItemsPositions.size
            }
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            resetHighlight()
            val foundItems = results?.values as ArrayList<Int>
            highlightAllFoundItems(constraint, foundItems)
            onSearchDone(foundItems)
        }
    }

    private fun highlightAllFoundItems(searchQuery: CharSequence?, items: ArrayList<Int>) {
        items.forEach { itemIndex ->
            val item = (bodyItems[itemIndex] as TransactionPayloadItem.BodyLineItem)
            item.line = item.line.highlightWithDefinedColors(searchQuery.toString(), backgroundSpanColorAll, foregroundSpanColorAll)
            notifyItemChanged(itemIndex)
        }
    }

    fun highlightSelected(previouslyHighlightedItem: Int, newlyHighlightedItem: Int) {
        replaceItemSpan(previouslyHighlightedItem, backgroundSpanColorAll, foregroundSpanColorAll)
        replaceItemSpan(newlyHighlightedItem, backgroundSpanColorCurrent, foregroundSpanColorCurrent)
    }

    private fun replaceItemSpan(itemIndex: Int, backgroundColor: Int, foregroundColor: Int) {
        val itemToUpdate = (bodyItems[itemIndex] as TransactionPayloadItem.BodyLineItem)
        val previousSpans = itemToUpdate.line.getSpans(0, itemToUpdate.line.length - 1, Any::class.java)
        if (previousSpans.isNotEmpty()) {
            val spanStart = itemToUpdate.line.getSpanStart(previousSpans[0])
            val spanEnd = itemToUpdate.line.getSpanEnd(previousSpans[0])
            val searchQuery = itemToUpdate.line.subSequence(spanStart, spanEnd).toString()
            itemToUpdate.line.clearSpans()
            itemToUpdate.line = itemToUpdate.line.highlightWithDefinedColors(searchQuery, backgroundColor, foregroundColor)
            notifyItemChanged(itemIndex)
        }
    }

    companion object {
        private const val TYPE_HEADERS = 1
        private const val TYPE_BODY_LINE = 2
        private const val TYPE_IMAGE = 3
    }
}

internal sealed class TransactionPayloadViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(item: TransactionPayloadItem)

    internal class HeaderViewHolder(
        private val headerBinding: ChuckerTransactionItemHeadersBinding
    ) : TransactionPayloadViewHolder(headerBinding.root) {
        override fun bind(item: TransactionPayloadItem) {
            if (item is TransactionPayloadItem.HeaderItem) {
                headerBinding.responseHeaders.text = item.headers
            }
        }
    }

    internal class BodyLineViewHolder(
        private val bodyBinding: ChuckerTransactionItemBodyLineBinding
    ) : TransactionPayloadViewHolder(bodyBinding.root) {
        override fun bind(item: TransactionPayloadItem) {
            if (item is TransactionPayloadItem.BodyLineItem) {
                bodyBinding.bodyLine.text = item.line
            }
        }
    }

    internal class ImageViewHolder(
        private val imageBinding: ChuckerTransactionItemImageBinding
    ) : TransactionPayloadViewHolder(imageBinding.root) {
        override fun bind(item: TransactionPayloadItem) {
            if (item is TransactionPayloadItem.ImageItem) {
                imageBinding.binaryData.setImageBitmap(item.image)
            }
        }
    }
}

internal sealed class TransactionPayloadItem {
    internal class HeaderItem(val headers: Spanned) : TransactionPayloadItem()
    internal class BodyLineItem(var line: SpannableStringBuilder) : TransactionPayloadItem()
    internal class ImageItem(val image: Bitmap) : TransactionPayloadItem()
}
