package com.example.app2rf4.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import com.example.app2rf4.back.AbmProducts
import com.example.app2rf4.back.Repository
import com.example.app2rf4.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {


    lateinit var binding: ActivitySearchBinding
    val myAbm = Repository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun search(){

    }

    fun searchProducts() {

        binding.svSearchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                val result:String = myAbm.searchProduct(query ?: "")
                Toast.makeText(this@SearchActivity, result, Toast.LENGTH_SHORT).show()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })
    }
}