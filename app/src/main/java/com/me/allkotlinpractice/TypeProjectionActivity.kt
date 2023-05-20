package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TypeProjectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ints: Array<Int> = arrayOf(1, 2, 3)
        val any :Array<Any> = Array(3) { "" }
        getTypeProjection(ints, any)
    }

    // README: This
    /*
     * If we want to copy all the elements of an array of some type into the array of
     * Any type then it can be possible, but to allow the compiler to compile our code \
     * we need to annotate the input parameter with the out keyword. This makes the compiler
     *  to infer that input argument can be of any type that is a subtype of the Any:
     */
    private fun getTypeProjection(from: Array<out Int>, to: Array<Any>) {
            assert(from.size == to.size)
            // copying (from) array to (to) array
            for (i in from.indices)
                to[i] = from[i]
            // printing elements of array in which copied
            for (i in to.indices) {
                println(to[i])
            }
    }
}