package com.example.september18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String API_KEY = "dc5264750b0a42ec9ccc9613c76c1b58";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.activity_main, new ArticleFragment()).commit();
        }

    }
}
