package com.example.app2rf4.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.back.HomeAdapter
import com.example.app2rf4.back.Repository
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
        val adapter = HomeAdapter(miRepository.getSomite())
        binding.rvHome.adapter = adapter
    }
}