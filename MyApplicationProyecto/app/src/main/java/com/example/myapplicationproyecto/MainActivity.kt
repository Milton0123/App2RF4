package com.example.myapplicationproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationproyecto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSetupSearch()
        initSetupAdd()
        initSetupDelete()
    }

    fun initSetupSearch() {
        binding.buttonSearchMenu.setOnClickListener {
            val miIntet = Intent(this, searchActivit::class.java)
            startActivity(miIntet)
        }
    }

    fun initSetupAdd() {
        binding.addMenuButton.setOnClickListener {
            val miIntet = Intent(this, addActivity::class.java)
            startActivity(miIntet)
        }
    }

    fun initSetupDelete() {
        binding.deleteButton.setOnClickListener {
            val miIntet = Intent(this, deleteActivity::class.java)
            startActivity(miIntet)
        }

    }

}