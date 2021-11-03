package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var calculatorTv:TextView
    private lateinit var number1Btn:RelativeLayout
    private lateinit var number2Btn:RelativeLayout
    private lateinit var number3Btn:RelativeLayout
    private lateinit var number4Btn:RelativeLayout
    private lateinit var number5Btn:RelativeLayout
    private lateinit var number6Btn:RelativeLayout
    private lateinit var number7Btn:RelativeLayout
    private lateinit var number8Btn:RelativeLayout
    private lateinit var number9Btn:RelativeLayout
    private lateinit var number0Btn:RelativeLayout
    private lateinit var timesBtn:RelativeLayout
    private lateinit var divBtn:RelativeLayout
    private lateinit var minBtn:RelativeLayout
    private lateinit var plusBtn:RelativeLayout
    private lateinit var equalBtn:RelativeLayout

    private var numberSt = ""
    private var numberOneInt = 0
    private var numberTowInt = 0
    private var operation = ""
    private var result = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculatorTv = findViewById(R.id.calculator_tv)
        number1Btn = findViewById(R.id.num_1_btn)
        number2Btn = findViewById(R.id.num_2_btn)
        number3Btn = findViewById(R.id.num_3_btn)
        number4Btn = findViewById(R.id.num_4_btn)
        number5Btn = findViewById(R.id.num_5_btn)
        number6Btn = findViewById(R.id.num_6_btn)
        number7Btn = findViewById(R.id.num_7_btn)
        number8Btn = findViewById(R.id.num_8_btn)
        number9Btn = findViewById(R.id.num_9_btn)
        number0Btn = findViewById(R.id.num_0_btn)
        timesBtn = findViewById(R.id.times_btn)
        divBtn = findViewById(R.id.div_btn)
        minBtn = findViewById(R.id.min_btn)
        plusBtn = findViewById(R.id.plus_btn)
        equalBtn = findViewById(R.id.equal_btn)



        number1Btn.setOnClickListener{
            checkResult()
            val number = "1"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number2Btn.setOnClickListener {
            checkResult()
            val number = "2"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number3Btn.setOnClickListener {
            checkResult()
            val number = "3"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number4Btn.setOnClickListener {
            checkResult()
            val number = "4"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number5Btn.setOnClickListener {
            checkResult()
            val number = "5"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number6Btn.setOnClickListener {
            checkResult()
            val number = "6"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number7Btn.setOnClickListener {
            checkResult()
            val number = "7"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number8Btn.setOnClickListener {
            checkResult()
            val number = "8"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number9Btn.setOnClickListener {
            checkResult()
            val number = "9"
            numberSt += number
            calculatorTv.text = numberSt
        }

        number0Btn.setOnClickListener {
            checkResult()
            val number = "0"
            numberSt += number
            calculatorTv.text = numberSt
        }

        plusBtn.setOnClickListener {
            numberOneInt = numberSt.toInt()
            operation = "plus"
            numberSt = ""
        }

        timesBtn.setOnClickListener {
            numberOneInt = numberSt.toInt()
            operation = "times"
            numberSt = ""
        }

        divBtn.setOnClickListener {
            numberOneInt = numberSt.toInt()
            operation = "div"
            numberSt = ""
        }

        minBtn.setOnClickListener {
            numberOneInt = numberSt.toInt()
            operation = "min"
            numberSt = ""
        }

        equalBtn.setOnClickListener{
            numberTowInt = numberSt.toInt()
            doOperation()
            result = "solved"
        }

    }
    @SuppressLint("SetTextI18n")
    private fun doOperation(){
        when (operation) {
            "plus" -> {
                calculatorTv.text = (numberOneInt + numberTowInt).toString()
            }
            "times" -> {
                calculatorTv.text = (numberOneInt * numberTowInt).toString()
            }
            "div" -> {
                calculatorTv.text = (numberOneInt / numberTowInt).toString()
            }
            "min" -> {
                calculatorTv.text = (numberOneInt - numberTowInt).toString()
            }
        }
    }

    private fun checkResult(){
        if (result == "solved"){
            calculatorTv.text = "0"
            numberSt = ""
            result = ""
            numberOneInt = 0
            numberTowInt = 0
        }
    }
}