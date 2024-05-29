package com.example.medvisor

import android.graphics.Typeface
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class faqactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faqactivity)

        val listView = findViewById<ListView>(R.id.listview)
        val names = arrayOf(
            "I've been experiencing a persistent...",
            "Could this be a common condition...",
            "Could these be symptoms of common...",
            "Are these common symptoms associated...",
            "Could this be a sign of a common ailment...",
            "I've been experiencing frequent allergies...",
            "Should I consider consulting a healthcare...",
            "I've been feeling unusually tired and fatigued...",
            "I've been having frequent headaches recently...",
            "I've been noticing digestive issues like bloating...",
            "I've been experiencing skin rashes and itching...",
            "I've been having trouble sleeping and feel...",
            "I've been having recurring sinus congestion..."
        )

        val arrayAdapter = object : ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names) {
            override fun getView(position: Int, convertView: android.view.View?, parent: android.view.ViewGroup): android.view.View {
                val view = super.getView(position, convertView, parent) as TextView
                view.setTextColor(resources.getColor(android.R.color.black))
                view.textSize = 15f
                view.typeface = Typeface.SANS_SERIF
                view.setPadding(8, 8, 8, 8)
                return view
            }
        }

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Redirecting you to link... " + names[i], Toast.LENGTH_LONG).show()
        }
    }
}