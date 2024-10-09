package com.example.myapplication.RoomDB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MedicationDao {
    @Insert
    suspend fun insertAll(medications: List<Medication>)

    @Query("SELECT * FROM Medication")
    fun getAllMedications(): Flow<List<Medication>>
}
