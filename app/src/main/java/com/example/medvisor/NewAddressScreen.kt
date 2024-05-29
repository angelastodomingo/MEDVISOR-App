package com.example.medvisor

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medvisor.databinding.ActivityNewAddressScreenBinding
import com.example.medvisor.onboarding.callScreen

class NewAddressScreen : AppCompatActivity() {
    private lateinit var binding: ActivityNewAddressScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewAddressScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cities = arrayOf("Nara, Tressique", "Lakeside View, Teyvat", "Cat's Cradle, Mondstatd", "New Mexico village, Natlan")

        val adapter = ArrayAdapter<String>(this, R.layout.spinner_item, cities)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        binding.cityspinner.adapter = adapter

        binding.addaddressbutton.setOnClickListener {
            val intent = Intent(this, callScreen::class.java)
            startActivity(intent)
        }
    }
}