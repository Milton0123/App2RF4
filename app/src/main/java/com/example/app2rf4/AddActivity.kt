package com.example.app2rf4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    lateinit var binding : ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}