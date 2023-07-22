package com.example.app2rf4.back

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyViewModel(productName: String?):ViewModel(){
    val data = MutableLiveData<ProductModel?>()
    private val miRepository = Repository()
    fun requestProduct(productKey: String): ProductModel?{
        CoroutineScope(Dispatchers.IO).launch{
            val result = miRepository.getProducts(productKey)
            data.postValue(result)
        }
    }
}

@Suppress("UNCHECKED_CAST")
class MyViewModelFactory(private val productName: String): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MyViewModel(productName) as T
        }
}