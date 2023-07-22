package com.example.app2rf4.back


class Repository():AbmProducts {
    override fun getProducts(): MutableList<ProductModel> {
        TODO("Not yet implemented")
    }

    override fun searchProduct(query: String): String {
        TODO("Not yet implemented")
    }

    override fun addProduct(
        name: String,
        price: Int,
        id: String,
        quantity: Int,
        trademark: String
    ): String {
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


