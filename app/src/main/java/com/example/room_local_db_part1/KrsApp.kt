package com.example.room_local_db_part1

import android.app.Application
import com.example.room_local_db_part1.dependenciesinjection.ContainerApp

class KrsApp : Application(){
    // Fungsinya untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate(){
        super.onCreate()
        // Membuat instance ContainerApp
        containerApp = ContainerApp(this)
        // instance adalah object yang dibuat dari class
    }
}