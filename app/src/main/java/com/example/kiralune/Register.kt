package com.example.kiralune

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kiralune.R

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val et_username: EditText = findViewById( R.id.et_username)
        val et_email : EditText = findViewById(R.id.et_email)
        val et_password: EditText = findViewById( R.id.et_password)
        val btn_daftar: Button = findViewById(R.id.btn_daftar)
        val btn_kembali: Button = findViewById(R.id.btn_kembali)

        btn_kembali.setOnClickListener {
            finish() // kembali ke halaman login
        }
    }
}
