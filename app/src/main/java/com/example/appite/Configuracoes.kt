package com.example.appite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Configuracoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_configuracoes)

        val botaoSair: Button = findViewById(R.id.btn_sair)
        botaoSair. setOnClickListener{
            AlertDialog.Builder(this)
                .setTitle("Quer Sair?")
                .setMessage("Tem certeza?")
                .setPositiveButton("Sim"){ variavel, numeroOpcao ->}
                .setNegativeButton("Não"){ variavel, numeroOpcao ->}
                .create()
                .show()
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
