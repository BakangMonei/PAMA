package com.madassignment.pama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.graphics.Color
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val passwordEditText: EditText = findViewById(R.id.editTextTextPassword)

        val github: ImageView = findViewById(R.id.githubIcon)
        val facebook: ImageView = findViewById(R.id.facebookIcon)
        val twitter: ImageView = findViewById(R.id.twitterIcon)

        val rememberMeCheckBox: CheckBox = findViewById(R.id.rememberMeCheckBox)

        val loginTxt: TextView = findViewById(R.id.LoginTextView)
        val registerTextView: TextView = findViewById(R.id.RegisterTextView)
        val forgetPass: TextView = findViewById(R.id.forgetPassTextView)

        val textView2: TextView = findViewById(R.id.textView2)
        val spannableString = SpannableStringBuilder("By signing in you are agreeing \nour ")
        val termsAndPrivacyString = "term and privacy policy"
        val start = spannableString.length
        spannableString.append(termsAndPrivacyString)

        // Make it bold
        spannableString.setSpan(
            StyleSpan(Typeface.BOLD),
            start,
            spannableString.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // Set the color
        spannableString.setSpan(
            ForegroundColorSpan(Color.BLUE),
            start,
            spannableString.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        textView2.text = spannableString
    }
}