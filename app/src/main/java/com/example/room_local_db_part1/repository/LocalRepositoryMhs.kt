package com.example.room_local_db_part1.repository

import com.example.room_local_db_part1.data.dao.MahasiswaDao
import com.example.room_local_db_part1.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs{
    override suspend fun insertMhs(mahasiswa: Mahasiswa){
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}