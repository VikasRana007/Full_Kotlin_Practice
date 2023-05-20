package com.me.allkotlinpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CovarianceActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getCovariance()
    }
     /// README: Implement
    // To Check error and acceptance at Compile time you can do uncomment the below code one by one and check.

    // IN the covariance we can implies the substitute of reference on to its subClass type but super type is not acceptable


    private fun getCovariance(){
//        val x : MyClass<Any> = MyClass<Int>()   // type mismatch error
//        We can directly allow covariance by appending out keyword to the declaration site i.e below line.
          val y : MyClass<out Any> = MyClass<String>()   // since the String is the sub type of Any super class
//        val z : MyClass<out String> = MyClass<Any>()   // Error since the Any is super type of String.
    }



    class MyClass<T>


}