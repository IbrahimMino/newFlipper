package com.example.recyclertest

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
lateinit var mContext:Context
class MessafeAdapter(private val context: Context, private val list:List<Message>):RecyclerView.Adapter<MessafeAdapter.IntroViewHolder>() {
    init {
        mContext = context
    }


    inner class IntroViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title = itemView.findViewById<TextView>(R.id.tv_title)
        fun onBind(item: Message){
            title.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return IntroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}