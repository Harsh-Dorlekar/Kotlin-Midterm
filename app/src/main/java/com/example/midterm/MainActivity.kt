package com.example.midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.b1)
        button.setOnClickListener()
        {
            callActivity()
        }
    }

    private fun callActivity()
    {

        val intent = Intent(this, MainActivity2::class.java).also{
            startActivity(it)
        }
    }
}