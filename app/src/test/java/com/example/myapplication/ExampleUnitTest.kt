package com.example.myapplication

import com.example.myapplication.RoomDB.Medication
import com.example.myapplication.ViewModel.LoginViewModel
import com.example.myapplication.ViewModel.MedicationViewModel
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    private lateinit var viewModel: LoginViewModel
    private lateinit var medicationViewModel: MedicationViewModel

    @Before
    fun setup() {
        viewModel = LoginViewModel()
    }

    @Test
    fun testGreetingMessage() {
        val greeting = viewModel.login("test@example.com","123")
        assert(greeting.equals("Good"))
    }

    @Test
    fun testMedicineInsertion(): Unit = runBlocking {
        val medicine = Medication(id = 1, name = "Aspirin", dose = "500mg", strength = "Strong")
        medicationViewModel.insertMedications(listOf(medicine))
        val medicines = medicationViewModel.getMedications()
        assert(medicines.equals(medicine))
    }

}