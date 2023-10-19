package com.learning.companianpractice

class InitMentor(firstName : String, lastName : String) {

    init {
        println("First Init Block : $firstName")
    }

    private val fullName = "$firstName $lastName".also { println("Fullname property") }

    constructor(firstName: String, lastName: String, interest : String) : this(firstName, lastName){
        println("Secondary constructor : $interest")
    }

    init {
        println("Second init block : ${fullName.length}")
    }


    // So the flow execution is in this order primary constructor, init blocks , secondary constructor...
    // in the above code even second init block comes after secondary constructor but it will execute after the execution of all init blocks.
}