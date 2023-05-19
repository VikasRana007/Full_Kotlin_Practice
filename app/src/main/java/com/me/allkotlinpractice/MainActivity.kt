package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        initData()
//        foo()
//        fooBar()
//        fooForEach()
//        fooReturn()
        //findViewById<TextView>(R.id.value).text = getString(R.string.extension_string).formattedString()
//        println("Hello Dev Vikas".formattedString())



// Below two are different cases for extension functions

//        fun Example.printFunctionType() { findViewById<TextView>(R.id.value).text = getString(R.string.extension_string_value) }

//         findViewById<TextView>(R.id.value).text = Example().printFunctionType()

        // Another case for extension function of Null value
//        findViewById<TextView>(R.id.value).text = null.formattedStringValue()
//        calculateRunTime { loop(500000) }


        BaseCaller().call(Base())   // "Base extension function in BaseCaller"
        DerivedCaller().call(Base())  // "Base extension function in DerivedCaller" - dispatch receiver is resolved virtually
        DerivedCaller().call(Derived())
    }


    private fun initData() {
       loop@for (i in 1..50) {
            for (j in 1..50) {
            Log.d("KOTLIN PRACTICE : ", "$j")
                if (j==10) break@loop
            }
        }
    }

    private fun foo(){
            listOf(1, 2, 3, 4, 5).forEach {
                println("Value here : $it")
                findViewById<TextView>(R.id.value).text = it.toString()
                if (it == 3) return // complete execution flow stopped at the given value

            }
            println("this point is unreachable")
        }

   private fun fooBar() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // return only at the given value
            println("@lit outcome : $it")
        }
        print(" done with explicit label")
    }

    private fun fooForEach() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
            findViewById<TextView>(R.id.value).text = it.toString()
            println(it)
        }
        print(" done with implicit label")
    }

    private fun fooReturn() {
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) return  // local return to the caller of the anonymous function - the forEach loop
            findViewById<TextView>(R.id.value).text = value.toString()
            println(value)
        })
        print(" done with anonymous function")
    }

    // extension functions with example

    private fun String.formattedString() : String {
        return "-------------\n$this\n-------------"
    }
    // Another example of Extension functions

    class Example {
        fun printFunctionType() : String {
            println("Class method")
            return "Class method"
        }
    }


    private fun Any?.formattedStringValue() : String {
        if (this == null) return "null"
        // after the null check, 'this' is autocast to a non-null type, so the toString() below
        // resolves to the member function of the Any class
        return this.toString()
    }

    // This function called from onCreate() of the activity , Check above



    // inline function example

    private inline fun calculateRunTime(Ax:()->Unit){              // Note : Multiple lambda using in the app makes
                                                           // a performance hit so not recommended to use every where
                                                          // and the best to use these function kotlin have to overcome this
                                                         // issue by using inline function
        val startTime = System.currentTimeMillis()
        Ax()
        val endTime = System.currentTimeMillis()
        println("Time Taken : ${endTime-startTime} ms")
    }

    private fun loop(n : Long){
        for (i in 0..n){
            // some task might
        }
    }


    open class Base { }

    class Derived : Base() { }

    open class BaseCaller {
        open fun Base.printFunctionInfo() {
            println("Base extension function in BaseCaller")
        }

        open fun Derived.printFunctionInfo() {
            println("Derived extension function in BaseCaller")
        }

        fun call(b: Base) {
            b.printFunctionInfo()   // call the extension function
        }
    }

    class DerivedCaller: BaseCaller() {
        override fun Base.printFunctionInfo() {
            println("Base extension function in DerivedCaller")
        }

        override fun Derived.printFunctionInfo() {
            println("Derived extension function in DerivedCaller")
        }
    }
}