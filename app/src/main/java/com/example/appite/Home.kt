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

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val botaoVerMais: Button = findViewById(R.id.verMais)
        botaoVerMais. setOnClickListener{
            var intent = Intent(this,ListaDeAtividades()::class.java)
            startActivity(intent)
        }

//        val botaoHomePagina: ImageButton = findViewById(R.id.homePagina)
//        botaoHomePagina. setOnClickListener{
//            var intent = Intent(this,Home()::class.java)
//            startActivity(intent)
//        }

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

        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.perfil -> {
                val intent = Intent(this, Perfil::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
