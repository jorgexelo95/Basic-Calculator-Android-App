package com.apolis.basiccalculatorapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator.*


class CalculatorUI : AppCompatActivity(), View.OnClickListener {
    var first: Double = 0.0
    var second: Double = 0.0
    var stringNum1: String = ""
    var resulOfEquation: Double = 0.0
    var stringEquation: String = ""
    var decimalFlag = false


    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_0 -> {
                var digit = 0
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_1 -> {
                var digit = 1
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_2 -> {
                var digit = 2
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_3 -> {
                var digit = 3
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_4 -> {
                var digit = 4
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_5 -> {
                var digit = 5
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_6 -> {
                var digit = 6
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_7 -> {
                var digit = 7
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_8 -> {
                var digit = 8
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_9 -> {
                var digit = 9
                stringNum1 += digit.toString()
                textView_result.text = stringNum1
            }
            R.id.button_add -> {
                first = stringNum1.toDouble()
                stringNum1 = ""
                stringEquation = "+"
                textView_result.text = "+"
            }
            R.id.button_addminus -> {

                first = stringNum1.toDouble();
                first *= -1
                stringNum1 = first.toString()
                textView_result.text = first.toString()
            }
            R.id.button_decimal -> {
                if (stringNum1.contains(".") == false) {
                    stringNum1 = stringNum1 + "."
                    textView_result.text = stringNum1
                }
            }
            R.id.button_c -> {
                stringNum1 = ""
                textView_result.text = stringNum1
            }
            R.id.button_del -> {
                stringNum1 = stringNum1.dropLast(1)
                textView_result.text = stringNum1
            }
            R.id.button_divide -> {
                first = stringNum1.toDouble()
                stringNum1 = ""
                stringEquation = "/"
                textView_result.text = "/"
            }
            R.id.button_equals -> {
                if (stringEquation == "+") {
                    second = stringNum1.toDouble()
                    resulOfEquation = first + second
                    stringNum1 = resulOfEquation.toString()
                    textView_result.text = resulOfEquation.toString()
                    stringEquation = ""
                }
                if (stringEquation == "-") {
                    stringEquation = ""
                    second = stringNum1.toDouble()
                    resulOfEquation = first - second
                    stringNum1 = resulOfEquation.toString()
                    textView_result.text = resulOfEquation.toString()

                }
                if (stringEquation == "/") {
                    stringEquation = ""
                    second = stringNum1.toDouble()
                    first = (first / second).toDouble()
                    stringNum1 = first.toString()
                    textView_result.text = first.toString()

                }
                if (stringEquation == "*") {
                    stringEquation = ""
                    second = stringNum1.toDouble()
                    resulOfEquation = first * second
                    stringNum1 = resulOfEquation.toString()
                    textView_result.text = resulOfEquation.toString()

                }
            }
            R.id.button_minus -> {
                first = stringNum1.toDouble()
                stringNum1 = ""
                stringEquation = "-"
                textView_result.text = "-"
            }
            R.id.button_multiply -> {
                first = stringNum1.toDouble()
                stringNum1 = ""
                stringEquation = "*"
                textView_result.text = "*"
            }
            R.id.button_percent -> {
                stringNum1 = (stringNum1.toDouble() * 0.1).toString()
                textView_result.text = stringNum1
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        button_0.setOnClickListener(this)
        button_1.setOnClickListener(this)
        button_2.setOnClickListener(this)
        button_3.setOnClickListener(this)
        button_4.setOnClickListener(this)
        button_5.setOnClickListener(this)
        button_6.setOnClickListener(this)
        button_7.setOnClickListener(this)
        button_8.setOnClickListener(this)
        button_9.setOnClickListener(this)
        button_c.setOnClickListener(this)
        button_add.setOnClickListener(this)
        button_addminus.setOnClickListener(this)
        button_decimal.setOnClickListener(this)
        button_del.setOnClickListener(this)
        button_divide.setOnClickListener(this)
        button_equals.setOnClickListener(this)
        button_minus.setOnClickListener(this)
        button_multiply.setOnClickListener(this)
        button_percent.setOnClickListener(this)


    }
}
