package com.example.app2rf4.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.back.HomeAdapter
import com.example.app2rf4.back.Repository
import com.example.app2rf4.back.Somite
import com.example.app2rf4.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val miRepository = Repository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        action()
    }
    private fun action(){
        startRecyclerView()
    }
    private fun startRecyclerView(){
        val adapter = HomeAdapter(miRepository.getSomite()){
            homeOnClicks(it)
        }
        binding.rvHome.adapter = adapter
    }
    private fun homeOnClicks( item : Somite){
        when(item.textTitle){
            "Add" ->{
                val miIntent=Intent(this,AddActivity::class.java)
                startActivity(miIntent)
                finish()
            }
            "Search" ->{
                val miIntent=Intent(this,FavoritesActivity::class.java)
                startActivity(miIntent)
                finish()
            }
            "Sell" ->{
                val miIntent=Intent(this,SellActivity::class.java)
                startActivity(miIntent)
                finish()
            }
            "Favorites" ->{
                val miIntent=Intent(this,FavoritesActivity::class.java)
                startActivity(miIntent)
                finish()
            }
            "Remove" ->{
                val miIntent=Intent(this,RemoveActivity::class.java)
                startActivity(miIntent)
                finish()
            }
        }
    }


}