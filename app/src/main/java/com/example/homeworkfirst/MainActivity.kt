package com.example.homeworkfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button: Button = findViewById(R.id.switch_activity)
        button.setOnClickListener {
            Intent(this, PersonActivity::class.java).also { startActivity(it) }
        }
    }
}