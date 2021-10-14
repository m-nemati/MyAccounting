package com.example.myaccounting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        title = "محاسبه پرداخت"
    }
}