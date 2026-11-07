package com.fahrixd.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView
import android.widget.LinearLayout
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.BLACK)

        val title = TextView(this)
        title.text = "FAHRIXD"
        title.textSize = 36f
        title.setTextColor(Color.RED)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "WELCOME TO FAHRIXD"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.WHITE)
        subtitle.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
