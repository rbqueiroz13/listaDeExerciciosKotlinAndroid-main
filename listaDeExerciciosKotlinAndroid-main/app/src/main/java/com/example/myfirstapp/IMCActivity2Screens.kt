package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
const val EXTRA_ALTURA = "com.example.myfirstapp.ALTURA"
const val EXTRA_PESO = "com.example.myfirstapp.PESO"

class IMCActivity2Screens : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_2_screens)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.etAltura)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun calcularIMC(v: View){
        //ENTRADA
        val editTextAltura = findViewById<EditText>(R.id.etAltura)
        val editTextPeso = findViewById<EditText>(R.id.etPeso)

        val altura = editTextAltura.text.toString().toDouble()
        val peso = editTextPeso.text.toString().toDouble()

        //PROCESSAMENTO
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_PESO, peso)
            putExtra(EXTRA_ALTURA, altura)
            putExtra(EXTRA_MESSAGE, "Seu IMC é")
        }
        //SAIDA
        startActivity(intent)
    }
}