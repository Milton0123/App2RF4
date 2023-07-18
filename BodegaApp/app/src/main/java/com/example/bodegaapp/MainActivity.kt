package com.example.bodegaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bodegaapp.databinding.ActivityMainBinding
import java.util.Objects

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
        binding.searchButton.setOnClickListener {
            val miIntet = Intent(this, MainActivity2::class.java)
            startActivity(miIntet)
        }
    }

    fun initSetupAdd() {
        binding.addButton.setOnClickListener {
            val miIntet = Intent(this, PantallaAgregar::class.java)
            startActivity(miIntet)
        }
    }

    fun initSetupDelete() {
        binding.deleteButton.setOnClickListener {
        val miIntet = Intent(this, PantallaDelete::class.java)
        startActivity(miIntet)
            }

        }

    }





