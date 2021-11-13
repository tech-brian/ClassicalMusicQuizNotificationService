package com.example.android.classicalmusicquiz;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class toast extends QuizActivity {

    public void oast(Context context){
        Toast.makeText(context, "Try to toast", Toast.LENGTH_SHORT).show();
    }
}
