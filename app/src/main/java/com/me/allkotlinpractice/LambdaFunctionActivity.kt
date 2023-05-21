package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LambdaFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lambda_function)

        val fn: (a: Double, b: Double) -> Double = ::sum

        val lambda : (Int,Int)-> Int = {x:Int, y:Int -> x+y}
        val multilineLambdaAgain = {
            println("This is Multiline Lambda")
            val a = 2+3
            "Hello Vikas Rana Dev"
            45
            // last statement always will be the return type in multiline lambda
        }
        // This is Another way of calling function using Lambda
        2.0.calculator(3.0) { x, y -> x + y }
        // Another way is
        calculator(2.0,3.0, { x, y -> x + y })
        // Another wya to write above calling statement if the lambda
        // have the last statement then you write it as below
        calculator(2.0,3.0) { x, y -> x + y }
        println(multilineLambdaAgain())

    // README   // Basically in Lambda function Declaration part and Body part
       // both are inside curly braces without typing any return type and omit fun keyword as well.

        // for example

        fun normalFunction(a : Int, b : Int) : Int{
            return a+b
        }
        // Above function can be converted into lambda as like below
        val sum = {a : Int, b : Int -> a+b}
         // function which have no name is called lambda function..
        // Another way of defining lambda

        val sum2 : (Int, Int)->Int = {
            a, b -> a*b
        }
          // And More Variation of Declaring Lambda here with single param.

        val sayHI = {msg:String -> println("Message : $msg")}

        // Another way of defining lambda
        val sayLambda : (Int)-> Int = {it+it}

        // Another way of defining lambda
        val sayLambda2 : (Int)-> Int = {x -> x+x}
    }


    private fun sum(a : Double, b : Double) : Double{
        return a.plus(b)
    }


    private fun Double.calculator(b: Double, gn: (Double, Double) -> Double){
        val result = gn(this,b)
        println("Result of Higher Order Function : $result")
    }

    private fun calculator(a : Double, b: Double, gn: (Double, Double) -> Double){
        val result = gn(a,b)
        println("Result of Higher Order Function : $result")
    }
}