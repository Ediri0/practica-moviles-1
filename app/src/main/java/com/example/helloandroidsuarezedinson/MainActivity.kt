package com.example.helloandroidsuarezedinson

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvSaludo: TextView = findViewById(R.id.txtContador)
        val btnSaludar: Button = findViewById(R.id.btnSaludar)

        btnSaludar.setOnClickListener {
            contador++
            tvSaludo.text = "¡Hola Android! Clics: $contador"

            Toast.makeText(this, "¡Botón presionado!", Toast.LENGTH_SHORT).show()
        }
    }
}