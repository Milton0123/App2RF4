package com.example.myapplication1

class Productos (name: String, code: String, price:Double)
{
    private var dinero: Int=500
    fun recibirBono(bono:Int)
    {
        this.dinero+bono
    }
}