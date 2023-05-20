package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StarProjectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Android", "Enthusiast", "Developer")
        getStarProjection(name)
    }


    // star projection in array . This will use where we don't know about the incoming data type
    private fun getStarProjection(array: Array<*>) {
        array.forEach { println(it) }
    }
}