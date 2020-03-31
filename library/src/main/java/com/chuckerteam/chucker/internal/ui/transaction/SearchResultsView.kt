package com.chuckerteam.chucker.internal.ui.transaction

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.chuckerteam.chucker.databinding.ChuckerViewSearchResultsBinding

internal class SearchResultsView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) :
    ConstraintLayout(context, attrs, defStyle) {

    private val searchResultsBinding =
        ChuckerViewSearchResultsBinding.inflate(
            LayoutInflater.from(context),
            this,
            true
        )

    fun onPreviousClick(listener: () -> Unit) {
        searchResultsBinding.previousItem.setOnClickListener {
            listener.invoke()
        }
    }

    fun onNextClick(listener: () -> Unit) {
        searchResultsBinding.nextItem.setOnClickListener {
            listener.invoke()
        }
    }

    fun resetCounters() {
        setCurrentItem(0)
        setOccurrencesCount(0)
    }

    fun setOccurrencesCount(foundItems: Int) {
        searchResultsBinding.itemsFound.text = foundItems.toString()
    }

    fun setCurrentItem(itemIndex: Int) {
        searchResultsBinding.currentItem.text = itemIndex.toString()
    }
}