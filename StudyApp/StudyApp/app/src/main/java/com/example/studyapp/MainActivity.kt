package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var androidBtn = findViewById<Button>(R.id.androidBtn)
        var kotlinBtn = findViewById<Button>(R.id.kotlinBtn)

        androidBtn.setOnClickListener{
            val intent = Intent(this, AndroidReview :: class.java)
            startActivity(intent)
        }
        kotlinBtn.setOnClickListener{
            val intent = Intent(this, KotlinReview :: class.java)
            startActivity(intent)
        }

    }
}