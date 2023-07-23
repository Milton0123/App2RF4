package com.example.app2rf4.back

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app2rf4.R
import com.example.app2rf4.databinding.ItemHomeBinding

class HomeAdapter(private val listOfSegments : List<Somite>): RecyclerView.Adapter<HomeHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home,parent,false)
        return HomeHolder(view)
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
        holder.render(listOfSegments[position])
    }

    override fun getItemCount(): Int {
        return listOfSegments.size
    }
}
class HomeHolder(view: View): RecyclerView.ViewHolder(view){
    private val binding = ItemHomeBinding.bind(view)
    fun render( value : Somite){
        binding.ivImagenIconos.setImageResource(value.imageProduct)
        binding.tvItem.text = value.textTitle
    }
}