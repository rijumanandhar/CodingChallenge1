package com.example.codingchallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String option = "1a";
    final String  TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkthis(option);
    }

    public void checkthis(String option){
        try{
            int opt = Integer.parseInt(option);
        }catch (NumberFormatException e){
            Log.e(TAG, "Format Exception");
        }
    }
}
