package com.generation.appdado2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val lados = intent.getIntExtra("LADOS", 0)

        val textDado = findViewById<TextView>(R.id.dadoEscolhido)
        val girarDado = findViewById<Button>(R.id.girarDado)

        textDado.text = "Dado com $lados"

        girarDado.setOnClickListener {

            girarDado(lados)
        }

    }

    private fun girarDado(lados: Int) {

        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(textResultado)

        




    }
}