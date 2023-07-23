package com.example.app2rf4.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        action()
    }

    private fun action() {
        goToLogin()
    }
    private fun goToLogin(){
        binding.btEnterLogin.setOnClickListener {
            startActivity(
                Intent(this, HomeActivity::class.java)
            )
            finish()
        }
    }
}
