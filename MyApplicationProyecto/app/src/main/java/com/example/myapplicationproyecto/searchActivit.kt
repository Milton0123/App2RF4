package com.example.myapplicationproyecto

import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplicationproyecto.databinding.ActivityMainBinding
import com.example.myapplicationproyecto.databinding.ActivitySearchBinding

class searchActivit : AppCompatActivity() {
    val viewModel by viewModels<MyViewModel>()
     lateinit var binding: searchActivit
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}