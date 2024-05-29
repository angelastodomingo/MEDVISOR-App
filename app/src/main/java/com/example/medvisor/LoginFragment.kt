package com.example.medvisor

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LoginFragment : Fragment() {

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: Button
    private lateinit var guestBtn: Button
    private lateinit var infobutton: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        usernameInput = view.findViewById(R.id.username)
        passwordInput = view.findViewById(R.id.password)
        loginBtn = view.findViewById(R.id.loginbutton)
        guestBtn = view.findViewById(R.id.logoutbutton)
        infobutton = view.findViewById(R.id.infobutton)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials", "Username : $username and Password : $password")

            if (validateInputs(username, password)) {
                if (username == "admin" && password == "system") {
                    // Navigate to Dashboard
                    val intent = Intent(activity, Dashboard::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(activity, "Invalid username or password.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        guestBtn.setOnClickListener {
            // Navigate to Dashboard
            val intent = Intent(activity, Dashboard::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the infobutton
        infobutton.setOnClickListener {
            showInfoAlert()
        }

        return view
    }

    private fun showInfoAlert() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Welcome to MedVisor!")
        builder.setMessage("This is a medical app made for a university project. Overall, it has basic functionalities, but it includes lots of features including: A basic login page, dashboard filled with four more features, and a scrollable medical records and appointments cards. It also includes an appointments tab wherein a user can book an appointment, and a records tab, wherein the user can view their past records and current medical records, and finally, settings, that does basic things and has a logout button. This has been a bit challenging to make. Additional features include consult-a-doctor, where the user can chat with a doctor (it's just an imageview for now since I do not know how to implement that for now; Book-an-appointment; Ambulance button feature, where the user can either call for an ambulance or request a home visit with either a nurse or doctor; and finally, a FAQ page, where it displays lots of commonly asked questions (The links don't work for now). This has been no doubt the toughest app I've ever made, but it's okay because I learned a lot during the process of developing this. I hope you find it appealing enough! Enjoy navigating through my app. OH yeah, the real username and password is 'admin' and 'system', respectively. But, you could also just continue as guest to make this process faster. ")
        builder.setPositiveButton("Got it") { dialog, which ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    private fun validateInputs(username: String, password: String): Boolean {
        return when {
            TextUtils.isEmpty(username) -> {
                Toast.makeText(activity, "Username is required.", Toast.LENGTH_SHORT).show()
                false
            }
            TextUtils.isEmpty(password) -> {
                Toast.makeText(activity, "Password is required.", Toast.LENGTH_SHORT).show()
                false
            }
            else -> true
        }
    }
}