package com.example.majorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Admissions : AppCompatActivity() {

    var tvAdmissionsPageLink:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admissions)

        tvAdmissionsPageLink = findViewById(R.id.tv_admissionsPageLink)

//        tvAdmissionsPageLink.setOnClickListener()

    }
}