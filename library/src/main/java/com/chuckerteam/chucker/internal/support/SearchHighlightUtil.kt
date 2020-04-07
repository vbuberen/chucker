package com.chuckerteam.chucker.internal.support

import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan

/**
 * Highlight parts of the [SpannableStringBuilder] when it matches the search query.
 *
 * @param searchQuery the text to highlight
 */
internal fun SpannableStringBuilder.highlightWithDefinedColors(
    searchQuery: String,
    backgroundColor: Int,
    foregroundColor: Int
): SpannableStringBuilder {
    val startIndexes = indexesOf(this, searchQuery)
    return applyColoredSpannable(this, startIndexes, searchQuery.length, backgroundColor, foregroundColor)
}

private fun indexesOf(text: CharSequence, searchQuery: String): List<Int> {
    val startPositions = mutableListOf<Int>()
    var index = text.indexOf(searchQuery, 0, true)
    while (index >= 0) {
        startPositions.add(index)
        index = text.indexOf(searchQuery, index + 1, true)
    }
    return startPositions
}

private fun applyColoredSpannable(
    text: CharSequence,
    indexes: List<Int>,
    length: Int,
    backgroundColor: Int,
    foregroundColor: Int
): SpannableStringBuilder {
    return indexes
        .fold(SpannableStringBuilder(text)) { builder, position ->
            builder.setSpan(
                ForegroundColorSpan(foregroundColor),
                position,
                position + length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            builder.setSpan(
                BackgroundColorSpan(backgroundColor),
                position,
                position + length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            builder
        }
}
