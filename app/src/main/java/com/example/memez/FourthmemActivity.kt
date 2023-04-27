package com.example.memez

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthmemActivity : AppCompatActivity() {
    lateinit var btnOne:Button
    @SuppressLint("ResourceType", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourthmem)
        btnOne = findViewById(R.id.btnOne)
        btnOne.setOnClickListener {
            var intent =Intent(this,FifthmemActivity::class.java)
            startActivity(intent)
        }


    }
}