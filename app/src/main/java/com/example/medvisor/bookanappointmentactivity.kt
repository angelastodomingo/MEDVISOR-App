package com.example.medvisor

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class bookanappointmentactivity : AppCompatActivity() {
    val hospitals = arrayOf("Jefferson Memorial Hospital, Tennessee", "Greenville Community Hospital, Tennessee", "Blount Memorial Hospital, Tennessee")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookanappointmentactivity)

        val spinner = findViewById<Spinner>(R.id.spinner1)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, hospitals)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext, "You have selected " + hospitals[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }
    }
}