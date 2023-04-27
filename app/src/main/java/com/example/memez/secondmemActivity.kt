package com.example.memez

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondmemActivity : AppCompatActivity() {
    lateinit var btnFive:Button
    lateinit var btnPreviouso:Button
//     @SuppressLint("MissingInflatedId")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondmem)
        btnFive =findViewById(R.id.btnFive)
        btnFive.setOnClickListener {
            val intent=Intent(this,ThirdmeemActivity::class.java)
            startActivity(intent)
        }
    btnPreviouso=findViewById(R.id.btnPreviouso)
    btnPreviouso.setOnClickListener {
        val  intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }



    }
}

