package com.example.myfamily

open class Persona(nombre: String, DNI: String, Dinero:Double)
{
    private var dinero: Int=500
    fun recibirBono(bono:Int)
    {
        this.dinero+bono
    }
}