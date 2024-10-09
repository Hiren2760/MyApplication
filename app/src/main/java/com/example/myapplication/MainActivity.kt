package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.RoomDB.Medication
import com.example.myapplication.RoomDB.MedicationDatabase
import com.example.myapplication.Screen.MedicationListScreen
import com.example.myapplication.Utils.MedicationRepository
import com.example.myapplication.Utils.SetupNavGraph
import com.example.myapplication.ViewModel.LoginViewModel
import com.example.myapplication.ViewModel.MedicationViewModel
import com.example.myapplication.ViewModel.MedicationViewModelFactory
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyApplicationTheme {
               val navController = rememberNavController()
                val loginViewModel = hiltViewModel<LoginViewModel>()
                SetupNavGraph(navController = navController, loginViewModel = loginViewModel)
//
               /* val database = MedicationDatabase.getDatabase(this)
                val repository = MedicationRepository(database.medicationDao())
                val viewModel: MedicationViewModel = viewModel(factory = MedicationViewModelFactory(repository))

                MedicationListScreen(viewModel = viewModel)

                // Parse and insert medications from JSON
                val medications = listOf(
                    Medication(name = "asprin", dose = "", strength = "500 mg"),
                    Medication(name = "somethingElse", dose = "", strength = "500 mg")
                )
                viewModel.insertMedications(medications)*/
            }
        }
    }
}

