package com.example.recyclertest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlipperAdapter(private val context:Context, private val listFlip:MutableList<String>):RecyclerView.Adapter<FlipperAdapter.FlipperViewholder>() {

    inner class FlipperViewholder(itemView: View):RecyclerView.ViewHolder(itemView){
        val tvTitle = itemView.findViewById<TextView>(R.id.tv_tarif_ban)
        fun onBind(item:String){
            tvTitle.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlipperViewholder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.banneritem,parent,false)
        return FlipperViewholder(view)
    }

    override fun getItemCount(): Int {
        return listFlip.size
    }

    override fun onBindViewHolder(holder: FlipperViewholder, position: Int) {
       holder.onBind(listFlip[position])
    }

}