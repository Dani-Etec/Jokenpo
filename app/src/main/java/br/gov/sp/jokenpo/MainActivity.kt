package br.gov.sp.jokenpo

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    private lateinit var imgComputador : ImageView
    private lateinit var txtResultado : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        imgComputador = findViewById<ImageView>(R.id.imgComputador)
        txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnPedra = findViewById<ImageView>(R.id.btnPedra)
        btnPedra.setOnClickListener { jogar("Pedra") }
        val btnPapel = findViewById<ImageView>(R.id.btnPapel)
        btnPapel.setOnClickListener { jogar("Papel") }
        val btnTesoura = findViewById<ImageView>(R.id.btnTesoura)
        btnTesoura.setOnClickListener { jogar("Tesoura") }
    }
    fun jogar(jogador : String){
        val opcoes = arrayOf("Pedra","Papel","Tesoura")
        val computador = opcoes[Random.nextInt(opcoes.size)]
        when(computador){
            "Pedra" -> imgComputador.setImageResource(R.drawable.pedra)
            "Papel" -> imgComputador.setImageResource(R.drawable.papel)
            "Tesoura" -> imgComputador.setImageResource(R.drawable.tesoura)
        }
        when {
            computador == jogador -> {txtResultado.text = "Empate"}
            (jogador == "Pedra" && computador == "Tesoura") || (jogador == "Tesoura" && computador == "Papel") || (jogador == "Papel" && computador == "Pedra") ->
            {
                txtResultado.text = "você venceu"
            }
            else -> {txtResultado.text = "você perdeu"}
        }
    }
}