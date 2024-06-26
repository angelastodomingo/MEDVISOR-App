package com.example.medvisor

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medvisor.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        val view = binding.root

        // click listener for profile button
        binding.profilebutton.setOnClickListener {
            // profile
            val intent = Intent(requireContext(), profile_screen::class.java)
            startActivity(intent)
        }

        binding.locationbutton.setOnClickListener {
            // location
            val intent = Intent(requireContext(), location_screen::class.java)
            startActivity(intent)
        }

        binding.notificationsbutton.setOnClickListener {
            // notification
            val intent = Intent(requireContext(), notificationssssScreen::class.java)
            startActivity(intent)
        }

        binding.privacypolicybutton.setOnClickListener {
            // privacypolicy
            val intent = Intent(requireContext(), privacypolicyscreen::class.java)
            startActivity(intent)
        }

        binding.termsofservicebutton.setOnClickListener {
            // terms of service
            val intent = Intent(requireContext(), termsofservicescreen::class.java)
            startActivity(intent)
        }

        binding.logoutbutton.setOnClickListener {
            // log out
            val intent = Intent(requireContext(), LoginFragment::class.java)
            startActivity(intent)
        }

        return view
    }
}