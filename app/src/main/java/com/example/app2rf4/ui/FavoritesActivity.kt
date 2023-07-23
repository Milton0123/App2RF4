package com.example.app2rf4.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.databinding.ActivityFavoritesBinding

class FavoritesActivity : AppCompatActivity() {
    lateinit var binding : ActivityFavoritesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        action()
    }
    private fun action(){
        backHome()
    }
    private fun backHome(){
        binding.btBackFavorites.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
            finish()
        }
    }
}
