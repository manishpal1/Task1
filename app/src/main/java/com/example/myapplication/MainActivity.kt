package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageObjects : MutableList<Images>  = mutableListOf()
        imageObjects.add(Images(R.drawable.img4,"img"))
        imageObjects.add(Images(R.drawable.img5,"img2"))
        imageObjects.add(Images(R.drawable.img6,"img3"))
        viewPage.adapter = ViewPagerAdapter(imageObjects)

    }

}