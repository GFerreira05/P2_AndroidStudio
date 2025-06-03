package com.example.appite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var login: EditText
    lateinit var senha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        login = findViewById(R.id.login)
        senha = findViewById(R.id.senha)

        val botaoLogar: Button = findViewById(R.id.botaoLogar)
        botaoLogar. setOnClickListener{
            var user = login.text.toString()
            var pass = senha.text.toString()


            if (verifica(user, pass)){
                var intent = Intent(this,Home()::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Login Não Permitido", Toast.LENGTH_LONG).show()
            }
        }

        val botaoLimpar: Button = findViewById(R.id.botaoLimpar)
        botaoLimpar.setOnClickListener {
            login.setText("")
            senha.setText("")
        }
    }

    private fun verifica (user: String, pass: String): Boolean{
        return user == "admin" && pass == "1234"
    }
}
