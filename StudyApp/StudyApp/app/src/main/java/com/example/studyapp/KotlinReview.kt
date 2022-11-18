package com.example.studyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinReview : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_review)

        val studyList = arrayListOf(
            arrayListOf("var and val","Declaring variables.","Detailed notes here."),
            arrayListOf("User Input","Getting user input.","Detailed notes here."),
            arrayListOf("Strings","String concatenations, interpolation, and method.","Detailed notes here."),
            arrayListOf("Data Type","Understanding data types.","Detailed notes here."),
            arrayListOf("Basic Operations","Performing math operations in Kotlin.","Detailed notes here."),
            arrayListOf("If Statement","Understanding when and how to use if, else if, and else statement.","Detailed notes here."),
            arrayListOf("Error Handling","Using try blocks to avoid runtime errors.","Detailed notes here."),
            arrayListOf("For Loops","Using for loops to automate code.","Detailed notes here."),
            arrayListOf("while Loops","Using while loops to automate code.","Detailed notes here."),

            )

        val myRV = findViewById<RecyclerView>(R.id.rvMain)

        myRV.adapter = RecyclerViewAdabter(this, studyList)
        myRV.layoutManager = LinearLayoutManager(this)

    }
}