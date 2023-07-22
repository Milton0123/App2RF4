package com.example.app2rf4.back

interface AbmProducts {

    fun getProducts(): MutableList<ProductModel>

    fun searchProduct(query: String):String

    fun addProduct(name:String, price:Int, id:String, quantity:Int, trademark:String):String

    fun deleteProduct(name:String, price:Int, id:String, quantity:Int, trademark:String):String

    fun addFavoriteProduct(name:String, price:Int, id:String, quantity:Int, trademark:String)

    fun sellProduct(id:String):String

}
