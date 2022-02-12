package com.example.instagramsignpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv_signUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_signUp = findViewById(R.id.tv_signUp)

        JavaCodes.signUpSetOnClick(this, tv_signUp)
//        KotlinCodes.signUpSetOnClick(this, tv_signUp)

    }
}