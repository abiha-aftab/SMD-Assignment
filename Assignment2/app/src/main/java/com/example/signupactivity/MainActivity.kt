package com.example.signupactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Toast
import android.app.Activity;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.button3) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            // your code to perform when the user clicks on the button
            finishAndRemoveTask();
        }

        // get reference to button
        val btn_click_me2 = findViewById(R.id.button2) as Button
        // set on-click listener
        btn_click_me2.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent =Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }

    }
}
