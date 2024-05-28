package com.example.medvisor.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.medvisor.R

class FirstScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_screen, container, false)

        // Set up ViewPager2 and click listener
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        view.findViewById<TextView>(R.id.firstnext).setOnClickListener {
            viewPager?.currentItem = 1
        }

        // Return the inflated view
        return view
    }
}