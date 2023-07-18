package com.example.myapplicationproyecto

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyViewModel:ViewModel() {
    val data=MutableLiveData<UserModel?>()
    val miRepository= Repository()

    fun searchUser (token:String){
        CoroutineScope(Dispatchers.IO).launch {
            val result=miRepository.getUser(token)
            data.postValue(result)
        }
    }
}