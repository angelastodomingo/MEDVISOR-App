package com.example.medvisor

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        val consultDoctorBtn = view.findViewById<ImageView>(R.id.consultdoctorbtn)
        val bookAppointmentBtn = view.findViewById<ImageView>(R.id.bookappointmentbtn)
        val ambulanceBtn = view.findViewById<ImageView>(R.id.ambulancebtn)
        val faqBtn = view.findViewById<ImageView>(R.id.faqbtn)

        consultDoctorBtn.setOnClickListener {
            val intent = Intent(context, consultadoctor::class.java)
            startActivity(intent)

        }

        bookAppointmentBtn.setOnClickListener {
            val fragment = AppointmentFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout, fragment)
            transaction.addToBackStack(null) // Optional: Add to back stack
            transaction.commit()
        }

        ambulanceBtn.setOnClickListener {
            val intent = Intent(context, ambulanceactivity::class.java)
            startActivity(intent)
        }

        faqBtn.setOnClickListener {
            val intent = Intent(context, faqactivity::class.java)
            startActivity(intent)
        }
        return view
    }
}