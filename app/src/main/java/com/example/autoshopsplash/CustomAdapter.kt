package com.example.autoshopsplash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var listaServiceModel: MutableList<ServiceModel>):RecyclerView.Adapter<CustomAdapter.MiHolder>() {
    inner class MiHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var vendedor:TextView
        lateinit var nombres:TextView
        lateinit var ciudad:TextView
        lateinit var telefono:TextView
        lateinit var imagen: ImageView
        init {
            vendedor = itemView.findViewById(R.id.idp)
            nombres = itemView.findViewById(R.id.nombrep)
            ciudad = itemView.findViewById(R.id.ciudadp)
            telefono = itemView.findViewById(R.id.celularp)
            imagen = itemView.findViewById(R.id.foto)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiHolder {

        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_vendedores,parent,false)
        return MiHolder(itemView)
    }

    override fun onBindViewHolder(holder: MiHolder, position: Int) {

        var serviceModel = listaServiceModel[position]
        holder.vendedor.text=serviceModel.idp
        holder.nombres.text=serviceModel.nombrep
        holder.ciudad.text=serviceModel.ciudadp
        holder.telefono.text=serviceModel.celularp
        holder.imagen.setImageResource(serviceModel.fotop)

    }

    override fun getItemCount(): Int {
        return listaServiceModel.size
    }
}
