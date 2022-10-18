package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Questao1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questao1)
    }
    fun questao1(view: View) {
        //ENTRADA
        val editTextNumero = findViewById<EditText>(R.id.etNumero)
        val numero = editTextNumero.text.toString().toDouble()

        //PROCESSAMENTO
        val sucessor = numero + 1
        val antecessor = numero - 1

        //SAIDA
        val textView = findViewById<TextView>(R.id.tvResult).apply {
            //text = message
            text = String.format("Obrigado!")
        }

        findViewById<TextView>(R.id.tvMessage).apply {
            //text = message
            text ="Seu antecessor e sucessores são respectivamente: $antecessor e $sucessor"
        }
    }
}