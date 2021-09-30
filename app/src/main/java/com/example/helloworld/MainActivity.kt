package com.example.helloworld

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Size
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find button in layout and set "onClick"
        findViewById<Button>(R.id.changeColorButton).setOnClickListener {
            // Find text view "Hello Graz"
            val helloGraz = findViewById<TextView>(R.id.textView)

            // Find green color from resources
            val color = ContextCompat.getColor(this, R.color.green)

            // Set color of "Hello Graz"
            helloGraz.setTextColor(color)
        }

        findViewById<Button>(R.id.changeSizeButton).setOnClickListener {

            val helloGraz = findViewById<TextView>(R.id.textView)
            helloGraz.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12F);
        }
    }
}

