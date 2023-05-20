package com.me.allkotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class DeepLinkHandlerImpl : DeepLinkHandler {
    override fun handleDeepLink(activity: AppCompatActivity, intent: Intent?) {
        activity.startActivity(intent)
        activity.finish()
    }
}