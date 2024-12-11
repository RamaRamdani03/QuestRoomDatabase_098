package com.example.room_local_db_part1.repository

import com.example.room_local_db_part1.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}