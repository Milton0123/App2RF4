package com.example.app2rf4.back

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class LocalData(context : Context) {
    val gson = Gson()
    val shared : SharedPreferences = context.getSharedPreferences("Productos", Context.MODE_PRIVATE)

    fun setProduct(productKey : String,product : MutableList<ProductModel>){
        val productJson = gson.toJson(product)
        shared.edit().putString(productKey, productJson).apply()
    }
    fun getProduct(productKey : String) : MutableList<ProductModel>{
        val productJson = shared.getString(productKey, "not found")
        val productObj = object : TypeToken<MutableList<ProductModel>>() {}.type
        return gson.fromJson(productJson, productObj)
    }
    fun deleteProduct(productKey : String){
        shared.edit().putString(productKey, null).apply()
    }
    fun clearStore(){
        shared.edit().clear().apply()
    }
}