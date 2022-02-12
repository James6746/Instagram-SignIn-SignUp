package com.example.instagramsignpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class JavaCodes{
    public static void signUpSetOnClick(Context context, TextView textView){
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SignUpPage.class);
                context.startActivity(intent);
            }
        });
    }

}
