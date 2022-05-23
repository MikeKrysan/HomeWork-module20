package com.appbymikekrysan.homework_module20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val content = findViewById<ViewGroup>(R.id.root)
        val view = layoutInflater.inflate(R.layout.item, content, false)
        content.addView(view)
    }
}