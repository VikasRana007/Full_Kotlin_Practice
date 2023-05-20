package com.me.allkotlinpractice

import androidx.lifecycle.LifecycleOwner

interface AnalyticsLogger  {

    fun registerLifecycleOwner(owner: LifecycleOwner)
}