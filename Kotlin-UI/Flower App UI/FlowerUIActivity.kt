package com.example.kotlin_ui.flowerAppUI

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.kotlin_ui.R

class FlowerUIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flower_ui)
        var a = findViewById<ImageView>(R.id.ig)
        var b = findViewById<EditText>(R.id.edt)
        var c = findViewById<EditText>(R.id.edt1)
        val d = findViewById<Button>(R.id.btn)
        val e = findViewById<Button>(R.id.btn1)

        e.setOnClickListener {
            val i = Intent(this, ForgotPassword::class.java)  // Use correct target activity
            startActivity(i)
        }

        d.setOnClickListener {
            var name = b.text.toString()
            val phone = c.text.toString()
            if (name == "abcd" && phone == "1234") {
                val i = Intent(this, menu::class.java)  // Use correct target activity
                startActivity(i)
            }
            else{
                Toast.makeText(this@FlowerUIActivity,"Invalid input",Toast.LENGTH_SHORT).show()
            }


        }
    }
}