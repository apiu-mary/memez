package com.example.memez

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixthmemActivity : AppCompatActivity() {
    lateinit var btnTwo:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixthmem)
        btnTwo =findViewById(R.id.btnTwo)
        btnTwo.setOnClickListener {
            val intent = Intent(this,FifthmemActivity::class.java)
        }
    }
}