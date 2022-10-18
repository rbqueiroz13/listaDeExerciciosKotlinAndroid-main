package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Questao3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questao3)
    }
    fun doarsangue(view: View) {
        //ENTRADA
        val editTextIdade = findViewById<EditText>(R.id.etIdade)

        val verificaridade = editTextIdade.text.toString().toDouble()

        //PROCESSAMENTO

        if (verificaridade <= 17) {
            findViewById<TextView>(R.id.tvMessage).apply {
                //text = message
                text = "Não Doador!"
            }
        } else if (verificaridade >= 18 && verificaridade <= 67) {
            findViewById<TextView>(R.id.tvMessage).apply {
                //text = message
                text = "Pode doar!"
            }
        } else {
            findViewById<TextView>(R.id.tvMessage).apply {
                //text = message
                text = "Não Doador!"
            }
        }


        //SAIDA
        val textView = findViewById<TextView>(R.id.tvResult).apply {
            //text = message
            text = String.format("Obrigado")
        }

    }
}