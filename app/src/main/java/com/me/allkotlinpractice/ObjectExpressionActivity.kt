package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ObjectExpressionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        first Example
        val test = object {
            var data = 45
            fun getValue(){
                println("Data : $data")
            }
        }

        test.getValue()

        // It is like the Anonymous class in java second example invoking
      val cloneableData = object : Cloneable {
            override fun clone() {
                println("Data is Cloned !")
            }
        }
        cloneableData.clone()


        //invoking of Third example

        var test2 = object : Person("Vikas Rana"){
            override fun fullName() {
                super.fullName()
                println("Anonymous == $name")
            }
        }

        test2.fullName()
    }


    // Second Example using interface
    interface Cloneable{
       fun clone()
    }


    // Third Example using Class

    open class Person(var name: String){
        open fun fullName(){
            println("Name : $name")
        }
    }





}