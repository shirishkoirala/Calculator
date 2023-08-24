package com.shirishkoirala.calculator.utils

import android.content.res.Resources
import com.shirishkoirala.calculator.R

object NumberUtils {

    fun isOperatorAdded(resource: Resources, value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains(resource.getString(R.string.divide)) ||
                    value.contains(resource.getString(R.string.minus)) ||
                    value.contains(resource.getString(R.string.plus)) ||
                    value.contains(resource.getString(R.string.multiply))
        }
    }

    fun isLastEntryDecimalPoint(resource: Resources, value: String): Boolean {
        return value.endsWith(resource.getString(R.string.decimal))
    }

    fun displayContainsDecimalPoint(resource: Resources, value: String): Boolean {
        return value.contains(resource.getString(R.string.decimal))
    }
}