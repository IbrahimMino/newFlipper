package com.example.recyclertest


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
lateinit var messageAdapter:MessafeAdapter
    lateinit var IntroAdapter:FlipperAdapter
    lateinit var viewPager2: ViewPager2

    lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.viewPager)


        val listFlip:MutableList<String> = mutableListOf(
                "Salom",
                "Nima gap",
                "Ishla yaxshimi",
                "Buluttimi",
                "Tatu",
                "TT",
                "FF"
        )


         IntroAdapter = FlipperAdapter(this@MainActivity,listFlip)


        viewPager2.adapter = IntroAdapter



    }
}