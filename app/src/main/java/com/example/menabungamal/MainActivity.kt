package com.example.menabungamal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btn_1)
        button = findViewById(R.id.btn_2)
        btn_1.setOnClickListener(){
            startActivity(Intent(this,menuUtama::class.java))
        }
        btn_2.setOnClickListener(){
            startActivity(Intent(this,signup::class.java))
        }
    }
}