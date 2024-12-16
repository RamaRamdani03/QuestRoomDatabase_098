package com.example.room_local_db_part1.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.room_local_db_part1.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}