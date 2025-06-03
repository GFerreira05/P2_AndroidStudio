package com.example.appite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class Carteirinha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_carteirinha)

        val button = findViewById<Button>(R.id.btn_carregar)
        button.setOnClickListener {
            val imageView = findViewById<ImageView>(R.id.minhaImagem)
            val url =
                "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhvz7IwZo9li2wF0MhMOLQHEJj-SIJRcj9F4A0i9hwr3m5HLQ4P8J6XFO_VkaQMzuXgSfoiRMvlvctN6ry6USXkLtTMpRke5TcFvYwoWQW7zDq8ubFRx_pMdztaQV9lfdQDtRBLqnHxcf0/s1600/11577_529851137065457_123677703_n.jpg"
            Glide.with(this)
                .load(url)
                .into(imageView)
        }

        val botaoHomePagina: ImageButton = findViewById(R.id.homePagina)
        botaoHomePagina. setOnClickListener{
            var intent = Intent(this,Home()::class.java)
            startActivity(intent)
        }

        val botaoLivro: ImageButton = findViewById(R.id.livroPagina)
        botaoLivro. setOnClickListener{
            var intent = Intent(this,ListaDeDisciplinas()::class.java)
            startActivity(intent)
        }

        val botaoMais: ImageButton = findViewById(R.id.adicionarPagina)
        botaoMais. setOnClickListener{
            var intent = Intent(this,Solicitacao()::class.java)
            startActivity(intent)
        }

        val botaoEventos: ImageButton = findViewById(R.id.eventosPagina)
        botaoEventos. setOnClickListener{
            var intent = Intent(this,Eventos()::class.java)
            startActivity(intent)
        }
    }
}