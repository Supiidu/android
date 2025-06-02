package com.example.projeto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.button3)
        val image = findViewById<ImageView>(R.id.imageView5)

        button.setOnClickListener {
            val intent = Intent(this, TelaInicio::class.java)
            startActivity(intent)
        }

        image.setOnClickListener {
            val intent = Intent(this, TelaInicio::class.java)
            startActivity(intent)
        }
    }
}