package com.example.myaccounting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        title = "محاسبه پرداخت"

        val inputTime: TextInputEditText = findViewById(R.id.input_time)
        val inputOneRate:TextInputEditText = findViewById(R.id.input_one_rate)
        val inputTax: TextInputEditText = findViewById(R.id.input_tax)
        val btnPayCalcute: Button = findViewById(R.id.btn_calc_pay)
        val outPutTotal: TextView = findViewById(R.id.output_total)

        btnPayCalcute.setOnClickListener {
            val timeInput = inputTime.text.toString().toDouble()
            val oneRateInput = inputOneRate.text.toString().toDouble()
            val TaxInput = inputTax.text.toString().toDouble()

            val total = timeInput * oneRateInput
            val tax: Double = (TaxInput * total)/ 100
            val getMoney = total - tax

            outPutTotal.text = getMoney.toString()

        }

    }
}