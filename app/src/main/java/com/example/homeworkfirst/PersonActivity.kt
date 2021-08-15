package com.example.homeworkfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PersonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}