package com.example.majorproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvFacultyStaff: TextView = findViewById<TextView>(R.id.tv_facultyStaff)
        tvFacultyStaff.setOnClickListener{
            val intent =  Intent(this,FacultyDirectory::class.java)
            startActivity(intent)
        }

        val tvAdmissions: TextView = findViewById<TextView>(R.id.tv_admissions)
        tvAdmissions.setOnClickListener{
            val intent =  Intent(this,Admissions::class.java)
            startActivity(intent)
        }


        val tvCourses: TextView = findViewById<TextView>(R.id.tv_courses)
        tvCourses.setOnClickListener{
            val intent =  Intent(this,Courses::class.java)
            startActivity(intent)
        }

        val ivInstagram: ImageView = findViewById<ImageView>(R.id.ivInstagram)
        ivInstagram.setOnClickListener{
            val intent =  Intent(this,Social::class.java)
            intent.putExtra("platform", "Instagram")
            startActivity(intent)
        }

        val ivTwitter: ImageView = findViewById<ImageView>(R.id.ivTwitter)
        ivTwitter.setOnClickListener{
            val intent =  Intent(this,Social::class.java)
            intent.putExtra("platform", "Twitter")
            startActivity(intent)
        }

        val ivFacebook: ImageView = findViewById<ImageView>(R.id.ivFacebook)
        ivFacebook.setOnClickListener{
            val intent =  Intent(this,Social::class.java)
            intent.putExtra("platform", "Facebook")
            startActivity(intent)
        }

    }

}