package com.example.medvisor

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medvisor.databinding.ActivityAmbulanceactivityBinding

class ambulanceactivity : AppCompatActivity() {

    private lateinit var binding: ActivityAmbulanceactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAmbulanceactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ambulancebutton.setOnClickListener {
            // Create an Intent to navigate to NewAddressScreen
            val intent = Intent(this, NewAddressScreen::class.java)
            startActivity(intent)
        }
    }
}