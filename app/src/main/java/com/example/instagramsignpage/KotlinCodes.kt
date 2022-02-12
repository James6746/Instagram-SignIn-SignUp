package com.example.instagramsignpage

import android.content.Context
import android.content.Intent
import android.widget.TextView

class KotlinCodes {
    companion object{
        fun signUpSetOnClick(context: Context, textView: TextView) {
            textView.setOnClickListener {
                val intent = Intent(context, SignUpPage::class.java)
                context.startActivity(intent)
            }
        }
    }
}