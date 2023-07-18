package com.example.bodegaapp

data class Producto(
    val nombre:String="",
    val precio:Double=0.0,
    var cantidad:Int=0,
    val marca:String="",
    val codigoBarras:String=""
)
