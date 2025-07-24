package com.example.kotlin_ui.flowerAppUI

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_ui.R

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgot_password)
        var btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            var i =Intent(this, FlowerUIActivity::class.java)
            startActivity(i)
        }
    }
}