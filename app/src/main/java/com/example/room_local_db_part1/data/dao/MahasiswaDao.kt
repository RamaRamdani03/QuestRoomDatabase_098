package com.example.room_local_db_part1.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.room_local_db_part1.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)

    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)
}