package com.generation.appdado2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        val intentDados = Intent(this, DadosActivity::class.java)

        button1.setOnClickListener {
            intentDados.putExtra("LADOS", 6)
            startActivity(intentDados)
        }
        button2.setOnClickListener {
            intentDados.putExtra("LADOS", 12)
            startActivity(intentDados)
        }
        button3.setOnClickListener {
            intentDados.putExtra("LADOS", 20)
        }
    }
}