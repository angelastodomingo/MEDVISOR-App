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
            .setMessage("At MEDVISOR, we prioritize the privacy and security of our patients' sensitive information. This Privacy Notice explains how we collect, use, and protect your data when you use our voice calling, video calling, and file attachment services.\n" +
                    "\n" +
                    "Information We Collect (This is not real, just an example.)\n" +
                    "Voice and Video Calls\n" +
                    "\n" +
                    "Metadata: We may collect metadata such as call duration, time, and participants.\n" +
                    "Content: The content of voice and video calls is not recorded or stored unless explicitly consented to by all participants.\n" +
                    "File Attachments\n" +
                    "\n" +
                    "Types of Files: We allow the attachment of various file types, including medical records, images, and other relevant documents.\n" +
                    "File Content: The content of these files may include sensitive medical information.\n" +
                    "How We Use Your Information\n" +
                    "Providing Services: To facilitate voice and video calls, and to handle file attachments as part of your care.\n" +
                    "Customer Support: To respond to your inquiries and provide support related to our services.\n" +
                    "Improvement of Services: To enhance the quality and functionality of our services based on usage patterns and feedback.\n" +
                    "Data Protection Measures\n" +
                    "Encryption:\n" +
                    "\n" +
                    "All voice and video calls are encrypted end-to-end to ensure confidentiality.\n" +
                    "Files attached to our services are encrypted during transmission and storage.\n" +
                    "Access Controls:\n" +
                    "\n" +
                    "Access to your data is restricted to authorized personnel who require it to perform their job duties.\n" +
                    "We implement robust authentication mechanisms to prevent unauthorized access.\n" +
                    "Data Storage:\n" +
                    "\n" +
                    "Sensitive data is stored in secure servers with regular security audits and updates.\n" +
                    "We employ industry-standard practices to safeguard against data breaches and unauthorized access.\n" +
                    "Third-Party Services:\n" +
                    "\n" +
                    "We may use third-party service providers to assist in delivering our services. These providers are bound by strict confidentiality agreements and are required to implement adequate security measures.\n" +
                    "Your Rights\n" +
                    "Access and Correction: You have the right to access and correct your personal information.\n" +
                    "Deletion: You may request the deletion of your data, subject to certain legal and operational limitations.\n" +
                    "Consent Withdrawal: You can withdraw your consent for data processing at any time, which may affect the availability of certain services.\n" +
                    "Contact Us\n" +
                    "If you have any questions or concerns about our privacy practices or this Privacy Notice, please contact us at:\n" +
                    "\n" +
                    "Email: privacy@MEDVISOR.com\n" +
                    "Phone: 123456789\n" +
                    "Address: Nara, 24 Tressique, Teyvat Street. IL\n" +
                    "Changes to This Privacy Notice\n" +
                    "We may update this Privacy Notice periodically to reflect changes in our practices or regulatory requirements. We will notify you of any significant changes by posting the updated notice on our website and/or through direct communication.\n" +
                    "\n" +
                    "By using our services, you acknowledge that you have read and understood this Privacy Notice, and you consent to the collection and use of your information as described herein.\n" +
                    "\n")
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