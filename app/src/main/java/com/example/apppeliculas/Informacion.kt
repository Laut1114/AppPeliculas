package com.example.apppeliculas

class Informacion(calificacion:String, nombre:String, genero:String, director:String, estreno:Int, productora:String) {
    var calificacion: String = "0"
    var nombre_pelicula: String = ""
    var genero_pelicula: String = ""
    var director_pelicula: String = ""
    var estreno_pelicula: Int = 0
    var productora_pelicula: String = ""

    init {
        this.calificacion = calificacion
        this.nombre_pelicula = nombre
        this.genero_pelicula = genero
        this.director_pelicula = director
        this.estreno_pelicula = estreno
        this.productora_pelicula = productora
    }
}