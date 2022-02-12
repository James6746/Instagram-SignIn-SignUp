package com.example.instagramsignpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        var tv_signIn = findViewById<TextView>(R.id.tv_signIn)

        tv_signIn.setOnClickListener{
            finish()
        }


        //=====================JAVA============================
//        tv_signIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish()
//            }
//        });

    }
}