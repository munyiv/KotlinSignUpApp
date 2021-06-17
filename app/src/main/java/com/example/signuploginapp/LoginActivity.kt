package com.example.signuploginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin1: Button
    lateinit var etPassword1: EditText
    lateinit var etEmail1: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castView()
        clickNext()
    }
    fun castView(){

        btnLogin1=findViewById(R.id.btnLogin1)

    }
    fun clickNext(){
        btnLogin1.setOnClickListener {
            val next= Intent(baseContext,MainActivity::class.java)
            startActivity(next)
        }
    }
}