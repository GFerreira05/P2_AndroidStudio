package com.example.appite

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListaDeDisciplinas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_de_disciplinas)

        val botaoDetalhes: Button = findViewById(R.id.btnDetalhes1)
        botaoDetalhes. setOnClickListener{
            var intent = Intent(this,DetalhesDisciplina()::class.java)
            startActivity(intent)
        }

        val botaoHomePagina: ImageButton = findViewById(R.id.homePagina)
        botaoHomePagina. setOnClickListener{
            var intent = Intent(this,Home()::class.java)
            startActivity(intent)
        }

//        val botaoLivro: ImageButton = findViewById(R.id.livroPagina)
//        botaoLivro. setOnClickListener{
//            var intent = Intent(this,ListaDeDisciplinas()::class.java)
//            startActivity(intent)
//        }

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
