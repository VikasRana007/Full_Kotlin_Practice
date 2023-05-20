package com.me.allkotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

interface DeepLinkHandler {
    fun handleDeepLink(activity : AppCompatActivity, intent : Intent?)
}