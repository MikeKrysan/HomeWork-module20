package com.appbymikekrysan.homework_module20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val content = findViewById<ViewGroup>(R.id.root)
//        val view = layoutInflater.inflate(R.layout.item, content, false)
//        content.addView(view)

        initMenuButtons()
    }

    private fun initMenuButtons() {
        button_1.setOnClickListener {
            Toast.makeText(this, "Здесь главное меню", Toast.LENGTH_SHORT).show()
        }
        button_2.setOnClickListener {
            Toast.makeText(this, "Горячие новинки сезона", Toast.LENGTH_SHORT).show()
        }
        button_3.setOnClickListener {
            Toast.makeText(this, "Обзоры и отзывы кинокритиков", Toast.LENGTH_SHORT).show()
        }
        button_4.setOnClickListener {
            Toast.makeText(this, "Отзывы зрителей", Toast.LENGTH_SHORT).show()
        }
        button_5.setOnClickListener {
            Toast.makeText(this, "Здесь вы можете задать ваши вопросы", Toast.LENGTH_SHORT).show()
        }
    }
}