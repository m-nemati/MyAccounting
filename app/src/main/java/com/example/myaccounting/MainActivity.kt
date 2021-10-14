package com.example.myaccounting

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin: Button = findViewById(R.id.btn_login)
        val inputUsername: TextInputEditText = findViewById(R.id.input_username)
        val inputPassword: TextInputEditText = findViewById(R.id.input_password)

        btnLogin.setOnClickListener {
            val username = inputUsername.text.toString()
            val password = inputPassword.text.toString()

            if (username == "admin" && password == "1400"){
                // Login
                val intent = Intent(this,AccountActivity::class.java)
                startActivity(intent)
            }
            else{
                // Error
                Toast.makeText(this, "نام کاربری یا پسورد اشتباه است", Toast.LENGTH_LONG).show()
            }
        }

    }
}