package com.example.phonenumberproject

import android.content.Context
import androidx.room.Room

object Graph {

    lateinit var database: ContactDatabase

    val contactViewModel by lazy {
        ContactViewModel(database.contactDao())
    }

    fun init(context: Context){
        database = Room.databaseBuilder(context,ContactDatabase::class.java,"contactdatabase.db").build()
    }

}