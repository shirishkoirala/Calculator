package com.shirishkoirala.calculator

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.shirishkoirala.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        viewModel = ViewModelProvider(
            this
        )[MainActivityViewModel::class.java]

        viewModel.displayString.observe(this) {
            binding.display.text = it
        }

        binding.buttonOne.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonTwo.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonThree.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonFour.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonFive.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonSix.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonSeven.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonEight.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonNine.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }
        binding.buttonZero.setOnClickListener { viewModel.onNumberPressed((it as Button).text.toString()) }

        binding.buttonClear.setOnClickListener { viewModel.onClearPressed(it) }
        binding.buttonDecimal.setOnClickListener { viewModel.onDecimalPoint(it) }

        binding.buttonDivide.setOnClickListener { viewModel.onDivide(it) }
        binding.buttonMultiply.setOnClickListener { viewModel.onMultiply(it) }
        binding.buttonMinus.setOnClickListener { viewModel.onMinus(it) }
        binding.buttonPlus.setOnClickListener { viewModel.onPlus(it) }

        binding.buttonEqual.setOnClickListener { viewModel.onEquals(it) }
    }
}