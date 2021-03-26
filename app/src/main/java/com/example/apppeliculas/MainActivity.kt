package com.example.apppeliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "com.example.appeliculas.PELICULA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = Button1 as Button
        val boton2 = Button2 as Button
        val boton3 = Button3 as Button

        boton1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Peliculas::class.java)
            intent.putExtra(TAG, "Las Cronicas de Narnia")
            startActivity(intent)
        })
        boton2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Peliculas::class.java)
            intent.putExtra(TAG, "Los Juegos del Hambre")
            startActivity(intent)
        })
        boton3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Peliculas::class.java)
            intent.putExtra(TAG, "Transformers")
            startActivity(intent)
        })
    }
}//ps6.76