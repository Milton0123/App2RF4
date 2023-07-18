package com.example.bodegaapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.SearchView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.bodegaapp.databinding.ActivityMain2Binding
import com.example.bodegaapp.databinding.ActivityMainBinding
import com.example.bodegaapp.databinding.ActivityPantallaDeleteBinding

class PantallaDelete : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        action()
    }

    fun action(){
        miDelete()
    }

    fun miDelete() {
        Bodega.stock.add(Producto())
        binding.SVBusquedaProducto.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                Toast.makeText(this@PantallaDelete,"Result",Toast.LENGTH_SHORT).show()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        }
        )
    }
}