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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        usernameInput = view.findViewById(R.id.username)
        passwordInput = view.findViewById(R.id.password)
        loginBtn = view.findViewById(R.id.loginbutton)
        guestBtn = view.findViewById(R.id.guestBtn)

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
                    Toast.makeText(activity, "Wrong username / password.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        guestBtn.setOnClickListener {
            // Navigate to Dashboard
            val intent = Intent(activity, Dashboard::class.java)
            startActivity(intent)
        }

        return view
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