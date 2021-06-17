package com.example.signuploginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    lateinit var btnSign: Button
    lateinit var etName:EditText
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var etPhone:EditText
    lateinit var spGender:Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        clickNext()
    }
    fun castView(){
        btnSign=findViewById(R.id.btnSign)
        etName=findViewById(R.id.etName)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        etPhone=findViewById(R.id.etPhone)
        spGender=findViewById(R.id.spGender)

        var gender= arrayOf("Select Gender","Male","Female","Other")
        var gendersAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,gender)
        gendersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=gendersAdapter


    }
    fun clickNext(){
        btnSign.setOnClickListener {
            val next= Intent(baseContext,LoginActivity::class.java)
            startActivity(next)
        }
}
}