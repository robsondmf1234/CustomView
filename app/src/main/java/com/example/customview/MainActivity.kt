package com.example.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linear = LinearLayout(this)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        linear.orientation = LinearLayout.VERTICAL
        linear.layoutParams = params
        linear.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))

        val text1 = TextView(this)
        val textParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        textParams.gravity = Gravity.CENTER_HORIZONTAL
        text1.layoutParams = textParams
        text1.setText("TextView numero 1")
        text1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.black))
        text1.setTextColor(ContextCompat.getColor(this, android.R.color.white))

        val text2 = TextView(this)
        val textParams2 = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        textParams2.gravity = Gravity.CENTER_HORIZONTAL
        text2.layoutParams = textParams
        text2.setText("TextView numero 2")
        text2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.black))
        text2.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))

        linear.addView(text1)
        linear.addView(text2)
        setContentView(linear)
    }
}