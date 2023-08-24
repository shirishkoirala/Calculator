package com.shirishkoirala.calculator

import android.view.View
import android.widget.Button
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val displayString = MutableLiveData("0")

    fun onNumberPressed(newString: String) {
        val currentString = StringBuilder()
        if (displayString.value != "0") {
            currentString.append(displayString.value)
        }
        currentString.append(newString)

        displayString.postValue(currentString.toString())
    }

    fun onClearPressed(view: View) {
        displayString.postValue("0")
    }

    fun onDecimalPoint(view: View) {

    }

    fun onPlus(view: View) {
    }

    fun onMinus(view: View) {

    }

    fun onDivide(view: View) {

    }

    fun onMultiply(view: View) {

    }

    fun onEquals(view: View) {

    }
}