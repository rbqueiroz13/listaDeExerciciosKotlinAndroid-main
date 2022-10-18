package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class IMCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)
    }

    fun calcularIMC(view: View) {
        //ENTRADA
        val editTextAltura = findViewById<EditText>(R.id.etAltura)
        val editTextPeso = findViewById<EditText>(R.id.etPeso)

        val altura = editTextAltura.text.toString().toDouble()
        val peso = editTextPeso.text.toString().toDouble()

        //PROCESSAMENTO
        val imc = peso/(altura*altura)

        val situacao =  if(imc < 17) "abaixo do peso"
                        else "normal"

        //SAIDA
        val textView = findViewById<TextView>(R.id.tvResult).apply {
            //text = message
            text = String.format("%.2f", imc)
        }

        findViewById<TextView>(R.id.tvMessage).apply {
            //text = message
            text = "Seu IMC é " + situacao
        }
    }
}