package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidReview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_review)

        val studyList = arrayListOf(
            arrayListOf("Project Setup","Setting up an Android Studio Project.","Detailed notes here."),
            arrayListOf("Console","Printing to the console.","Detailed notes here."),
            arrayListOf("Resource Files","Identifying, editing, and using resource files.","Detailed notes here."),
            arrayListOf("UI Elements","Creating, modifying, and initializing UI Elements.","Detailed notes here."),

            )

        val myRV = findViewById<RecyclerView>(R.id.rvMain)

        myRV.adapter = RecyclerViewAdabter(this,studyList)
        myRV.layoutManager = LinearLayoutManager(this)


    }
}