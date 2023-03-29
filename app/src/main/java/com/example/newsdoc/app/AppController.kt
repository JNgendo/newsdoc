package com.example.newsdoc.app

import android.app.Application

class AppController:Application() {
    companion object {
        lateinit var instances: AppController private set
        const val TAG ="newsdoc"
    }

    override fun onCreate() {
        super.onCreate()
       instances=this
    }
}


