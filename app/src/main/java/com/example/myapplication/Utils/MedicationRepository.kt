package com.example.myapplication.Utils

import com.example.myapplication.RoomDB.Medication
import com.example.myapplication.RoomDB.MedicationDao
import kotlinx.coroutines.flow.Flow

class MedicationRepository(private val medicationDao: MedicationDao) {

    val allMedications: Flow<List<Medication>> = medicationDao.getAllMedications()

    suspend fun insert(medications: List<Medication>) {
        medicationDao.insertAll(medications)
    }
}
