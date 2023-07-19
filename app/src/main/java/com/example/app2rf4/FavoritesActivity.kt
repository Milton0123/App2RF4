package com.example.app2rf4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.databinding.ActivityFavoritesBinding
import com.example.app2rf4.databinding.ActivityMainBinding

class FavoritesActivity : AppCompatActivity() {
    lateinit var binding : ActivityFavoritesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}