package com.example.app2rf4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.example.app2rf4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initSetup()
    }
    fun initSetup(){
        binding.btSearchButton.setOnClickListener{
            val response=(binding.svSearchProductBar.text.toString())
            binding.tvSearchOption.text=response?.name
        }
        binding.btBackButton.setOnClickListener(){
            startActivity(Intent())
            finish();
        }

        }

    }
