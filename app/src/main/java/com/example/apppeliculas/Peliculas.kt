package com.example.apppeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_peliculas.*

class Peliculas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peliculas)

        var textViewCalifiacion = calificacion as TextView
        var textViewNombre = nombre as TextView
        var textViewGenero = genero as TextView
        var textViewDirector = director as TextView
        var textViewEstreno = estreno as TextView
        var textViewProductor = productora as TextView


        val pelicula: String? = intent.getStringExtra("com.example.appeliculas.PELICULA")

        val pelicula1 = Informacion("3/5", "Las Cronicas de Narnia", "Fantasia", "Andrew Adanson", 2005, "20th Century Fox")
        val pelicula2 = Informacion("4/5", "Los Juegos del Hambre", "Accion/Ciencia Ficción", "Gary Ross", 2012, "Lionsgate")
        val pelicula3 = Informacion("5/5", "Trasnformers", "Accion/Ciencia Ficción", "Michael bay", 2007, "Paramount Pictures")

        if (pelicula == "Las Cronicas de Narnia") {
            imageView.setImageResource(R.drawable.logo_kt_3)
            textViewCalifiacion.text = pelicula1.calificacion
            textViewNombre.text = pelicula1.nombre_pelicula
            textViewGenero.text = pelicula1.genero_pelicula
            textViewDirector.text = pelicula1.director_pelicula
            textViewEstreno.text = (pelicula1.estreno_pelicula).toString()
            textViewProductor.text = pelicula1.productora_pelicula
        } else {
            if (pelicula == "Los Juegos del Hambre") {
                imageView.setImageResource(R.drawable.logo_kt2)
                textViewCalifiacion.text = pelicula2.calificacion
                textViewNombre.text = pelicula2.nombre_pelicula
                textViewGenero.text = pelicula2.genero_pelicula
                textViewDirector.text = pelicula2.director_pelicula
                textViewEstreno.text = (pelicula2.estreno_pelicula).toString()
                textViewProductor.text = pelicula2.productora_pelicula
            } else {
                if (pelicula == "Transformers") {
                    imageView.setImageResource(R.drawable.logo_kt1)
                    textViewCalifiacion.text = pelicula3.calificacion
                    textViewNombre.text = pelicula3.nombre_pelicula
                    textViewGenero.text = pelicula3.genero_pelicula
                    textViewDirector.text = pelicula3.director_pelicula
                    textViewEstreno.text = (pelicula3.estreno_pelicula).toString()
                    textViewProductor.text = pelicula3.productora_pelicula
                }
            }
        }

        val voto = ratingBar

        voto.setOnClickListener {
            Toast.makeText(this, "Votación enviada", Toast.LENGTH_LONG).show()
        }
    }
}
