package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.pow

class HighOrderFunctionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Now we can store the function in variable as like objects in kotlin
        getFunValue()
    }

    private fun getFunValue() {
        println(sum(2.0, 2.0))
        println(power(2.0, 3.0))

        // Now the Game is here
//        val fn: (a: Double, b: Double) -> Double = ::sum
        val fn = ::sum

        println("This is Function Value : ${fn(4.0, 3.0)}")  // we can this variable like it


//        calling the higher order function now

        calculator(2.5, 4.5, ::sum)
    }


    private fun sum(a : Double, b : Double) : Double{
        return a.plus(b)
    }


    private fun power(a : Double, b : Double) : Double{
        return a.pow(b)
    }


    /*
    * Higher Order Function like as which fun that accept function as argument or return or both. i.e below
     */

    /**
     * This Calculator() fun is type of High Level or Order Function
     */
    private fun calculator(a : Double, b : Double, gn : (Double, Double) -> Double){
        val result = gn(a,b)
        println("Result of Higher Order Function : $result")
    }




}