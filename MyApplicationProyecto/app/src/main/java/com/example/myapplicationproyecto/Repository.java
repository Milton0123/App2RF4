package com.example.myapplicationproyecto;

public class Repository (){
    suspend fun getUser(token:String):UserModel?{
        Thread.sleep(3000);
        if (token=="asd"){
            return UserModel()
        }else{
            return null
        }
    }
}
