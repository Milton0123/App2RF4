package com.example.myapplicationproyecto

open class Administrador:Admin {
    fun getList():MutableList<Producto>{
        return Bodega.stock
    }
    fun baseBodega(){
        Bodega.stock.add(
            Producto(
                "Tomate",
                50.0,
                50,
                "SanJuan",
                "1234")
        )
        Bodega.stock.add(
            Producto(
                "Maiz",
                20.0,
                50,
                "SanJuan",
                "1235")
        )
        Bodega.stock.add(
            Producto(
                "Chile",
                35.0,
                50,
                "SanJuan",
                "1236")
        )
        Bodega.stock.add(
            Producto(
                "Frijol",
                15.0,
                50,
                "SanJuan",
                "1237")
        )
        Bodega.stock.add(
            Producto(
                "Calabaza",
                25.0,
                50,
                "SanJuan",
                "1238")
        )
    }

    override fun agregarProductos(
        nombre: String,
        precio: Double,
        cantidad: Int,
        marca: String,
        codigoBarras: String
    ): String {
        return String()
    }

    override fun buscarProductos(nombre: String): String {
        return String()
    }

    override fun eliminarProducto(nombre: String, codigoBarras: String): String {
        return String()
    }
}