package com.example.snakegame


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Level1 = findViewById<Button>(R.id.level1)
        Level1.setOnClickListener{
            val Intent= Intent(this, MainActivity1::class.java)
            startActivity(Intent)
        }

        val Level2 = findViewById<Button>(R.id.level2)
        Level2.setOnClickListener{
            val Intent= Intent(this, MainActivity2::class.java)
            startActivity(Intent)
        }

        val Level3 = findViewById<Button>(R.id.level3)
        Level3.setOnClickListener{
            val Intent= Intent(this, MainActivity3::class.java)
            startActivity(Intent)
        }


    }

}