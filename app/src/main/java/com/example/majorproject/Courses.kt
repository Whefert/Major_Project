package com.example.majorproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.majorproject.databinding.ActivityCoursesBinding

class Courses : AppCompatActivity() {
    var binding: ActivityCoursesBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCoursesBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = CoursesAdapter(CourseList.courseList,
            {
                    courseId -> getCourseDetails(courseId)
            }
        )
        binding?.rvCourses?.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        binding?.rvCourses?.adapter = adapter
    }

    fun getCourseDetails(courseId: String){
        val myIntent = Intent(this,CourseDetails::class.java)
        myIntent.putExtra("courseId", courseId)
        startActivity(myIntent)
    }

    override fun onDestroy(){
        super.onDestroy()
        binding =null
    }

}