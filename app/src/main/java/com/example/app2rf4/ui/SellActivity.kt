package com.example.app2rf4.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.databinding.ActivitySellBinding

class SellActivity : AppCompatActivity() {
    lateinit var binding: ActivitySellBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySellBinding.inflate(layoutInflater)
        setContentView(binding.root)
        action()
    }
    fun action(){
        backHome()
    }
    fun backHome(){
        binding.btBackSell.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }

}