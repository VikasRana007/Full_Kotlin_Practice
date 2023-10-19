package com.learning.companianpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        initView()

//        constCheck()

        inlineFeature()
    }


    private fun initView() {
        /**
         * We can invoke by both way.
         */
        println("MAX VALUE : ${Mentor.MAX_VALUE}")
        // println("MAX VALUE : ${Mentor.Companion.MAX_VALUE}") // but it is redundant

        // Mentor.Companion.guide()    // but it is redundant
        Mentor.guide()

        println("MAX VALUE : ${Mentor.Config.MAX_SLOTS}")    // object name is mandatory
        println("MIN VALUE : ${Mentor.ConfigInfo.MIN_SLOTS}")    // object name is mandatory


        InitMentor(firstName = "Vikas", lastName = "Rana", interest = "Android")
    }


    private fun constCheck() {
        val name = Constants.INITIAL_VALUE
    }


    private fun inlineFeature(){

    }

    private fun guide() {
        print("guide start")
        teach()
        print("guide end")
    }

    private inline fun teach() {
        print("teach")
    }
}