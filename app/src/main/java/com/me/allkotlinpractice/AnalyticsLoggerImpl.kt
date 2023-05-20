package com.me.allkotlinpractice

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class AnalyticsLoggerImpl : AnalyticsLogger, LifecycleEventObserver {
    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event){
            Lifecycle.Event.ON_RESUME -> println("User is on the Screen")
            Lifecycle.Event.ON_PAUSE -> println("User is leave the Screen")
            Lifecycle.Event.ON_START -> println("User is Just on the Screen")
            Lifecycle.Event.ON_CREATE -> println("User is Creating the Screen")
            Lifecycle.Event.ON_STOP -> println("User is rid from the Screen")
            Lifecycle.Event.ON_DESTROY -> println("User is just destroying the Screen")
            Lifecycle.Event.ON_ANY -> println("User is anywhere on the Screen")
        }
    }
}