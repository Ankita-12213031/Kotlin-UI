package com.example.customlistview

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.listView)

        val myItems=listOf(
            Myitem("Mobile App Development","This is Android App",R.drawable.img) ,
                    Myitem("Web Development","This is Web Development",R.drawable.img),
        Myitem("Machine Learning","This is Machine Learning",R.drawable.img)
        )

        val adapter=MyAdapter(this,myItems)
        listView.adapter=adapter

        listView.setOnItemClickListener(object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val item=myItems[position]
                Toast.makeText(this@MainActivity,"Clicked: ${item.title}",Toast.LENGTH_SHORT).show()
        }
    })
    }
}