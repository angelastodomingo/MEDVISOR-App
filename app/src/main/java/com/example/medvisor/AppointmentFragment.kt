package com.example.medvisor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AppointmentFragment : Fragment() {

    private lateinit var spinner1: Spinner
    private lateinit var spinner2: Spinner
    private lateinit var spinner3: Spinner

    private val hospitals = arrayOf(
        "Jefferson Memorial Hospital, Tennessee",
        "Greenville Community Hospital, Tennessee",
        "Blount Memorial Hospital, Tennessee"
    )

    private val specialties = arrayOf(
        "Cardiology",
        "Dermatology",
        "Neurology"
    )

    private val doctors = arrayOf(
        "Dr. George Hyukoh",
        "Dr. Stephanie Gingrich",
        "Dr. Alexander Chen"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_appointment, container, false)

        // Initialize the spinners
        spinner1 = view.findViewById(R.id.spinner1)
        spinner2 = view.findViewById(R.id.spinner2)
        spinner3 = view.findViewById(R.id.spinner3)

        // Set up adapters
        // Set up adapters with custom spinner item layout
        val hospitalAdapter = ArrayAdapter(requireContext(), R.layout.spinner_item, hospitals)
        hospitalAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        spinner1.adapter = hospitalAdapter

        val specialtyAdapter = ArrayAdapter(requireContext(), R.layout.spinner_item, specialties)
        specialtyAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        spinner2.adapter = specialtyAdapter

        val doctorAdapter = ArrayAdapter(requireContext(), R.layout.spinner_item, doctors)
        doctorAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        spinner3.adapter = doctorAdapter

        // Set up item selected listeners for spinner1
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    requireContext(),
                    "You have selected " + hospitals[position],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }

        // Set up item selected listeners for spinner2
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    requireContext(),
                    "You have selected " + specialties[position],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }

        // Set up item selected listeners for spinner3
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    requireContext(),
                    "You have selected " + doctors[position],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }

        // Button for booking an appointment
        val bookAppointmentButton = view.findViewById<Button>(R.id.bookapptBtn)
        bookAppointmentButton.setOnClickListener {
            Toast.makeText(context, "Booked appointment!", Toast.LENGTH_SHORT).show()
        }

        return view  // This should be the last line in the onCreateView method
    }

    private fun setupItemSelectedListener(spinner: Spinner, data: Array<String>) {
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(requireContext(), "You have selected ${data[position]}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }
    }
}