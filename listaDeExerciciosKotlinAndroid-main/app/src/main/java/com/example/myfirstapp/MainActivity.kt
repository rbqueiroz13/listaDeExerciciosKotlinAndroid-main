package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToScreenIMC2Screens(view: View) {
        val intent = Intent(this, IMCActivity2Screens::class.java)
        //SAIDA
        startActivity(intent)
    }

    fun goToScreenIMC(view: View) {
        val intent = Intent(this, IMCActivity::class.java)
        //SAIDA
        startActivity(intent)
    }
    fun goToScreenQuestao1(view: View) {
        val intent = Intent(this, Questao1::class.java)
        //SAIDA
        startActivity(intent)
    }
    fun goToScreenQuestao2(view: View) {
        val intent = Intent(this, Questao2::class.java)
        //SAIDA
        startActivity(intent)
    }
    fun goToScreenQuestao3(view: View) {
        val intent = Intent(this, Questao3::class.java)
        //SAIDA
        startActivity(intent)
    }
}