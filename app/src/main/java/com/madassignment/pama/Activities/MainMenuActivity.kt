package com.madassignment.pama.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.madassignment.pama.R

import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.madassignment.pama.Dashboard.PhoneCallActivity
import com.madassignment.pama.Dashboard.SendEmailActivity
import com.madassignment.pama.Dashboard.SendMessageActivity
import com.madassignment.pama.Dashboard.WebBrowserActivity

class SuccessfulLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        // ImageView
        val phoneCallImageView: ImageView = findViewById(R.id.phoneCallImageView)
        val emailImageView: ImageView = findViewById(R.id.emailImageView)
        val webBrowserImageView: ImageView = findViewById(R.id.webBrowserImageView)
        val smsImageView: ImageView = findViewById(R.id.smsImageView)
        //val settingsImageView: ImageView = findViewById(R.id.settingsImageView)
        //val profileTextView: ImageView = findViewById(R.id.profileTextView)
        // val helpImageView: ImageView = findViewById(R.id.helpImageView)

        // TextViews
        // val mainMenuTextView: TextView = findViewById(R.id.mainMenuTextView)
        val callTextView: TextView = findViewById(R.id.CallTextView)
        val emailTextView: TextView = findViewById(R.id.emailTextView)
        val smsTextView: TextView = findViewById(R.id.smsTextView)
        //val webBrowserTextView: TextView = findViewById(R.id.settingsTextView)
        // val settingsTextView: TextView = findViewById(R.id.mainMenuTextView)
        // val helpTextView: TextView = findViewById(R.id.helpTextView)


        // Making phoneCall
        phoneCallImageView.setOnClickListener {
            Toast.makeText(this, "Make a phone call", Toast.LENGTH_SHORT).show()
            val call = Intent(this, PhoneCallActivity::class.java)
            startActivity(call)
        }

        // Accessing the internet browser
        webBrowserImageView.setOnClickListener {
            Toast.makeText(this, "Search on the web", Toast.LENGTH_SHORT).show()
            val web = Intent(this, WebBrowserActivity::class.java)
            startActivity(web)
        }

        // Sending an email
        emailImageView.setOnClickListener {
            Toast.makeText(this, "Send an email", Toast.LENGTH_SHORT).show()
            val sendEmail = Intent(this, SendEmailActivity::class.java)
            startActivity(sendEmail)
        }

        // Sending SMS
        smsImageView.setOnClickListener {
            val sms = Intent(this, SendMessageActivity::class.java)
            startActivity(sms)
            Toast.makeText(this, "Sending sms", Toast.LENGTH_SHORT).show()
        }

        // Settings
        /*settingsImageView.setOnClickListener {
            val settings = Intent(this, SettingsActivity::class.java)
            startActivity(settings)
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
        }*/

        // Help Section


        // userProfile
        /*profileTextView.setOnClickListener {
            val userPro = Intent(this, UserProfile::class.java)
            startActivity(userPro)
            Toast.makeText(this, "User Profile", Toast.LENGTH_SHORT).show()

            databaseConnection.readUser()
        }*/
    }
}
