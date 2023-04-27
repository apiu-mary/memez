package com.example.memez

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthmemActivity : AppCompatActivity() {
    lateinit var btnTwo:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifthmem)
        btnTwo = findViewById(R.id.btnTwo)
        btnTwo.setOnClickListener {
            var intent =Intent(this,SixthmemActivity::class.java)
        }
    }
}