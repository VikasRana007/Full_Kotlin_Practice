package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.properties.Delegates

class PracticeKotlinMore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice_kotlin_more)

//        getDay()

//        getTile()

//        println(container(5))

        val iContainer =  Container(23)
//        iContainer.setValue(23)
        println("Value for Generic : ${iContainer.getValue()}")
    }

//    private fun  container(data : Int){
//       var value by Delegates.notNull<Int>()
//        fun getValue() : Int{
//            return value
//        }
//
//        fun setValue(){
//            value  = data
//        }
//    }


    /**
     * Using Any
     */
//    class Container<Any : kotlin.Any>(data : kotlin.Any){
//        var value by Delegates.notNull<kotlin.Any>()
//        fun getValue(){
//            value
//        }
//
//        fun setValue(){
//            value = value
//        }
//    }

    /**
     * Using Type T and Any class of Kotlin
     */
//    class Container<T>(data : kotlin.Any){
//        var value by Delegates.notNull<kotlin.Any>()
//        fun getValue(){
//            value
//        }
//
//        fun setValue(){
//            value = value
//        }
//    }


    /**
     * Using Type T
     */

    class Container<T>(var data : T){
        fun getValue() : T{
            return data
        }

        fun setValue(value : T){
            data = value
        }
    }

    private fun getTile() {
//        val tile = Tile.Red("Mushroom", 25)
//        val tileSecond = Tile.Red("Fire",25)
//
//        println("${tile.point} - ${tile.type}")

        val tile : Tile = Tile.Red("Mushroom", 25)
//        val tileBlue : Tile = Tile.Blue(30)

        val point = when(tile){
            is Tile.Red ->  tile.point*2
            is Tile.Blue -> tile.point*5
        }

        println(point)




    }

    private fun getDay(){
//        val day = Day.FRIDAY
//        println("Week Day : $day")

        for(i in Day.values()){
            println(i.printFormattedDay())

//            println(Day(i).printFormattedDay())
//            day.printFormattedDay()
        }

//        day.printFormattedDay()
    }

   private enum class Day(i : Int){
       SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
       SATURDAY(7);

       fun printFormattedDay(){
           println("Day is : $this")
       }
   }


     sealed class Tile {
        class Red(val type : String, val point : Int) : Tile()
        class Blue(val point : Int) : Tile()

    }
}