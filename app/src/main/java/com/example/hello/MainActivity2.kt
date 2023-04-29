package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var button3: TextView
    lateinit var button5: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button3 = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        button5 = findViewById(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this,memes::class.java)
            startActivity(intent)
        }
    }
}