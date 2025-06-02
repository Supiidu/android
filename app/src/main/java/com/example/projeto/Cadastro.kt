package com.example.projeto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro)

        val back = findViewById<ImageView>(R.id.imageView2)

        back.setOnClickListener {
            finish()
        }

        val register = findViewById<Button>(R.id.button5)

        register.setOnClickListener{
            val intent = Intent(this, TelaInicio::class.java)
            startActivity(intent)
        }
    }
}