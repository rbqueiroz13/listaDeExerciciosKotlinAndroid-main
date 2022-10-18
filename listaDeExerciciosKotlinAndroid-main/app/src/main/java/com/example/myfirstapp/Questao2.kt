package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Questao2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questao2)
    }
    fun questao2(view: View) {
        //ENTRADA
        val editTextnumero = findViewById<EditText>(R.id.etNumber)

        val tabuada = editTextnumero.text.toString().toDouble()

        //PROCESSAMENTO
        var cont = 1

        while (cont <= 10) {
            findViewById<TextView>(R.id.tvMessage).apply {
                //text = message
                text = "$tabuada x $cont = ${tabuada*cont}"
            }
            cont++
        }

        //SAIDA
        val textView = findViewById<TextView>(R.id.tvResult).apply {
            //text = message
            text = String.format("O número escolhido foi: $tabuada")
        }

    }
}