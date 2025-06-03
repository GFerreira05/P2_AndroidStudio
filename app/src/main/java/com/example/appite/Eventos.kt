package com.example.appite

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Eventos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eventos)

        val nomes = listOf("01/06 - Mensalidade escolar com desconto [6/12 ou 6/6]",
            "05/06 - Vencimento da 6ª mensalidade escolar [6/12 ou 6/6]",
            "04 a 12/06 - Período das Avaliações Regimentais (provas)",
            "13 a 23/06 - Período de Provas Substitutivas (disciplinas regime semestral)",
            "19 a 21/06 - Corpus Christi (Recesso Escolar + Administrativo)",
            "24 a 30/06 - Período dos Exames Finais (cursos de regime semestral)",
            "30/06 - Último dia do 1º período do ano letivo"
        )

        val listView = findViewById<ListView>(R.id.eventos)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nomes)

        listView.adapter = adapter

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

//        val botaoEventos: ImageButton = findViewById(R.id.eventosPagina)
//        botaoEventos. setOnClickListener{
//            var intent = Intent(this,Eventos()::class.java)
//            startActivity(intent)
//        }
    }
}
