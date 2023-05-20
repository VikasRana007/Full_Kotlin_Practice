package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContraCovarianceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getContraCovariance()
    }

    /**
     * It is used to substitute a supertype value in the subtypes, i.e. the generic
     * function/class may accept supertypes of the datatype it is already defined for,
     * e.g. a generic class defined for Number cannot accept Int, but a generic class defined for Int can accept Number.
     */

    private fun getContraCovariance() {
     val x : Container<Dog> = Container<Animal>()
//     val y : Container<Animal> = Container<Dog>()  // it generating compile time error
    }

    open class Animal
    class Dog : Animal()
    class Container<in T>
}