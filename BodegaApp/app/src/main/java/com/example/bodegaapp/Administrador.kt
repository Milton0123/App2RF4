package com.example.bodegaapp

interface Administrador {
    fun agregarProductos(
        nombre:String,
        precio:Double,
        cantidad:Int,
        marca:String,
        codigoBarras:String):String
    fun buscarProductos(
        nombre:String
    ):String
    fun eliminarProducto(
        nombre:String,
        codigoBarras:String
    ):String
}