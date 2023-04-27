package com.example.memez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnnext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnnext = findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
            val intent = Intent(this,secondmemActivity::class.java)
            startActivity(intent)
        }
    }
}

