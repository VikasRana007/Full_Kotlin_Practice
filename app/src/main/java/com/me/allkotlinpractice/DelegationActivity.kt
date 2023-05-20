package com.me.allkotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import kotlin.reflect.KProperty

class DelegationActivity : AppCompatActivity(),
    AnalyticsLogger by AnalyticsLoggerImpl(),     // <-- that is another way of implementing Delegation here
    DeepLinkHandler by DeepLinkHandlerImpl() {

//    private val obj by lazy {                          // This is calling property Delegation
//        println("Hello World")
//        45
//        "Hello World"
//    }


    private val obj by MyLazy {
        println("null")                                  // This is calling property Delegation
        45
    }



override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
//        getDelegation()

//        registerLifecycleOwner(this)


    Toast.makeText(this, "$obj", Toast.LENGTH_SHORT).show()

}

override fun onNewIntent(intent: Intent?) {
    super.onNewIntent(intent)
    handleDeepLink(this, intent)
}

private fun getDelegation() {
    Derived(BaseImpl(5)).print()
}
}


class Derived(b: Base) : Base by b
class BaseImpl(var x: Int) : Base {
    override fun print() {
        println("This is Delegation ! $x")
    }
}

interface Base {
    fun print()
}


class MyLazy<out T : Any>(private val initialize: () -> T) {

    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return (
                if (value == null) {
                    value = initialize()
                    value!!
                }
                else value!!
                )
    }

}