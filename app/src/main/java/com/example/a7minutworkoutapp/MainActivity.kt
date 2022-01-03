package com.example.a7minutworkoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var llStart: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llStart = findViewById(R.id.llStart)
        llStart.setOnClickListener {
            val intent  = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }




    }
}