package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Object Declaration and Expression explaining in this class.
 */
class ObjectDeclarationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // getObjectOut()

        SharingWidget.incrementFbLikes()
        SharingWidget.incrementFbLikes()
        SharingWidget.incrementFbLikes()
        SharingWidget.incrementTwitterLikes()
        SharingWidget.incrementTwitterLikes()
        SharingWidget.display()

    }

    private fun getObjectOut() {
        println("Getting Value of Object A: ${A.value}")

        println("Getting Value of fun of Object B: ${B.getValue(12)}")
    }


    // There explanation which is mention below is called declaration of object... that's it, and how to use these declaration
    //    explain above.
    object A{
        var value : Int = 8
    }

    object B{
        var value : Int = 0

        fun getValue(value : Int) : Int{
            this.value = value+value
            println("I am an Object B here !")
            return this.value
        }



    }


    //Example of Singleton Property

    object SharingWidget{
        private var twitterLikes = 0
        private var fbLikes = 0

        fun incrementTwitterLikes() = twitterLikes++
        fun incrementFbLikes() = fbLikes++
        fun display() = println("Facebook-- :$fbLikes ==== \n Twitter Likes-- :$twitterLikes")
    }
}