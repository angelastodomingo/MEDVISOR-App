package com.example.medvisor

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class consultadoctor : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create and show an AlertDialog
        val alertDialog = AlertDialog.Builder(this)
            .setTitle("Privacy Notice")
            .setMessage("Okay, this isn't actually a privacy notice. But welcome! If you haven't noticed it by now, this is a medical app made for a university project. \n\nOverall, it has basic functionalities, but it includes lots of features including: A basic login page, dashboard filled with four more features, and a scrollable medical records and appointments cards. \n\nIt also includes an appointments tab wherein a user can book an appointment, and a records tab, wherein the user can view their past records and current medical records, and finally, settings, that does basic things and has a logout button. \n\nAdditional features include consult-a-doctor, where the user can chat with a doctor (it's just an imageview for now since I do not know how to implement that for now; Book-an-appointment; Ambulance button feature, where the user can either call for an ambulance or request a home visit with either a nurse or doctor; and finally, a FAQ page, where it displays lots of commonly asked questions (The links don't work for now). \n\nThis has been no doubt the toughest app I've ever made, but it's okay because I learned a lot during the process of developing this. I hope you find it appealing enough! Enjoy navigating through my app. OH yeah, the real username and password in the login page is 'admin' and 'system', respectively. But, you could also just continue as guest to make this process faster. Enjoy!")
            .setPositiveButton("Got it") { dialog, _ ->
                // Set the content view after the user presses "Okay"
                dialog.dismiss()
                setContentView(R.layout.activity_consultadoctor)

                // Find ImageView elements
                val videocall = findViewById<ImageView>(R.id.videocall)
                val voicecall = findViewById<ImageView>(R.id.voicecall)
                val attachmenticon = findViewById<ImageView>(R.id.attachmenticon)

                // Set click listeners to display toast messages
                videocall.setOnClickListener {
                    Toast.makeText(this, "Video calling M.D. Alina Gregorio...", Toast.LENGTH_SHORT).show()
                }

                voicecall.setOnClickListener {
                    Toast.makeText(this, "Calling M.D. Alina Gregorio...", Toast.LENGTH_SHORT).show()
                }

                attachmenticon.setOnClickListener {
                    Toast.makeText(this, "Attached file successfully!", Toast.LENGTH_SHORT).show()
                }
            }
            .setCancelable(false) // Prevent dismissal by clicking outside
            .create()

        alertDialog.show()
    }
}