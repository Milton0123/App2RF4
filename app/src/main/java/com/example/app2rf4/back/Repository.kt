package com.example.app2rf4.back

import android.content.Context

class Repository(context:Context):AbmProducts {
    //val stock= LocalData(context)

    override fun getProducts(): MutableList<ProductModel> {

        TODO("Not yet implemented")
    }

    override fun searchProduct(query: String): String {
//        var thereIsNo=true
//        var value= ""
//
//        (lista de objetos).forEach{
//            if(it.name = query){
//                thereIsNo=false
//                value = "Producto Encontrado"
//            }
//        }
//        if(thereIsNo) {
//            value = "No se ha encontrado producto"
//        }
//        return value
        TODO("Not yet implemented")
    }

    override fun addProduct(name: String, price: Int, id: String, quantity: Int, trademark: String): String {
//        var addNew = true
//        var value = ""
//
//        (lista de objetos).forEach {
//            if (it.name == name) {
//                it.quantity += quantity
//                addNew = false
//                value = "producto actualizado"
//            }
//        }
//
//        if (addNew) {
//            (lista de productos).add(ProductModel(name, price, id, quantity, trademark))
//            value = "producto nuevo agregado"
//        }
//        return value
        TODO("Not yet implemented")
    }

    override fun deleteProduct(
        name: String,
        price: Int,
        id: String,
        quantity: Int,
        trademark: String
    ): String {
        TODO("Not yet implemented")
    }

    override fun addFavoriteProduct(
        name: String,
        price: Int,
        id: String,
        quantity: Int,
        trademark: String
    ) {
        TODO("Not yet implemented")
    }

    override fun sellProduct(id: String): String {
        TODO("Not yet implemented")
    }


}
