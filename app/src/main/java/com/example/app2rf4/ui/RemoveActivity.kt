package com.example.app2rf4.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2rf4.databinding.ActivityRemoveBinding

class RemoveActivity : AppCompatActivity() {
    lateinit var binding: ActivityRemoveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRemoveBinding.inflate(layoutInflater)
        setContentView(binding.root)
        action()
    }
    private fun action(){
        backHome()
    }
    private fun backHome(){
        binding.btBackRemove.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}
