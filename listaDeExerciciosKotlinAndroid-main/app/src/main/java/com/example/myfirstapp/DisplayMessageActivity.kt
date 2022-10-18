package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val altura = intent.getDoubleExtra(EXTRA_ALTURA, 0.0)
        val peso = intent.getDoubleExtra(EXTRA_PESO, 0.0)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.tvResult).apply {
            //text = message
            text = String.format("%.2f", peso/(altura*altura))
        }

        findViewById<TextView>(R.id.tvMessage).apply {
            //text = message
            text = message
        }


    }
}