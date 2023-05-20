package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VarianceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // out keyword example testing
        val out = OutClass("Vikas Rana")
        val any : OutClass<Any> = out                  // Produces Value of OutClass can not assign to it's SuperType i.e Any,
        // we can do it by using out key word in the OutClass Type
        // that used below. That is called Declaration - site variance (using in and out).


        // in keyword example testing
        val inClassObject : InClass<String> = InClass()
        var valueInt : InClass<String> = inClassObject          // this is only possible with the help of "in" keyword .



        /*This in and out type variance is called invariance*/
    }

    /**
     * Now  If we want to assign it to the reference of its subtype then we can use the in keyword
     * on the generic type. The in keyword can be used only on the parameter type that is consumed, not produced:
     */
    // we have a class of

//    case of keyword in kotlin Generics
    class InClass<in T>{
        fun toString(value : T) : String{
            return value.toString()                 // here toString() is consuming a value of type T , and it can only consume.
        }
    }



    // case of out keyword in kotlin Generics
    class OutClass<out T>(val value : T){
        fun get() : T {
            return value
        }
    }

}