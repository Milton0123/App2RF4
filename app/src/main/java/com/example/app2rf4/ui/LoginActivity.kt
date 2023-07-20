package com.example.app2rf4.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.HomeActivity
import com.example.app2rf4.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        action()
    }

    fun action() {
        binding.btEnterLogin.setOnClickListener {
            startActivity(
                Intent(this, HomeActivity::class.java)
            )
        }
    }
}
