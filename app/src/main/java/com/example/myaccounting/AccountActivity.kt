package com.example.myaccounting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val btnPay: Button = findViewById(R.id.btn_pay)

        btnPay.setOnClickListener {
            val intent = Intent(this, PayActivity::class.java)
            startActivity(intent)
        }
    }
}