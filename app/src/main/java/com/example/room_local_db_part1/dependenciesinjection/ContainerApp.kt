package com.example.room_local_db_part1.dependenciesinjection

import android.content.Context
import com.example.room_local_db_part1.data.database.KrsDatabase
import com.example.room_local_db_part1.repository.LocalRepositoryMhs
import com.example.room_local_db_part1.repository.RepositoryMhs

interface  InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private  val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}