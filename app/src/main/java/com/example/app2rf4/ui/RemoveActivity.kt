package com.example.app2rf4.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.databinding.ActivityRemoveBinding

class RemoveActivity : AppCompatActivity() {
    lateinit var binding: ActivityRemoveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRemoveBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
