package com.example.drsasho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Кнопка "Поздравить"
        val button1: Button = findViewById(R.id.button1)

        //Обработка нажатия, перебросит на следующий активити
        button1.setOnClickListener {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
        val textView: TextView = findViewById(R.id.textView)
        textView.getPaint().setUnderlineText(true);
    }
}