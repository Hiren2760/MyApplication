package com.example.myapplication.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.RoomDB.Medication
import com.example.myapplication.ViewModel.MedicationViewModel

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun MedicationListScreen(viewModel: MedicationViewModel) {
    val medications = viewModel.medications.value

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(medications.size) { index ->
            MedicationCard(medication = medications[index])
        }
    }
}

@Composable
fun MedicationCard(medication: Medication) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Name: ${medication.name}")
            Text(text = "Dose: ${medication.dose}")
            Text(text = "Strength: ${medication.strength}")
        }
    }
}
