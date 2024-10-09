package com.example.myapplication.RoomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Medication(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val dose: String,
    val strength: String
)
