package com.example.app2rf4.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    lateinit var binding: ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}