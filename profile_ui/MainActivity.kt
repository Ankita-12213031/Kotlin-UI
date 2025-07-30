package com.example.profile_ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editBtn = findViewById<Button>(R.id.editProfileBtn)
        val aboutBtn = findViewById<Button>(R.id.aboutMeBtn)

        editBtn.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        aboutBtn.setOnClickListener {
            startActivity(Intent(this, AboutmeActivity::class.java))
        }
    }
}