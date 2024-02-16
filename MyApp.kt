package com.example.phonenumberproject

import android.app.Application

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.init(this)
    }
}