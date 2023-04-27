package com.example.memez

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdmeemActivity : AppCompatActivity() {
lateinit var btnen:Button
lateinit var btnyen:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdmeem)
        btnen =findViewById(R.id.btnen)
        btnen.setOnClickListener {
            var intent =Intent(this,FourthmemActivity::class.java)
            startActivity(intent)
        }
        btnyen=findViewById(R.id.btnyen)
        btnyen.setOnClickListener {
            val intent =Intent(this,secondmemActivity::class.java)
            startActivity(intent)
        }




    }
}