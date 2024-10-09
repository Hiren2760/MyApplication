package com.example.myapplication.Model

data class MedicalResponse(
    val problems: List<Problem>
)

data class Problem(
    val Diabetes: List<Diabetes>? = null,
    val Asthma: List<Asthma>? = null
)

data class Diabetes(
    val medications: List<Medications>,
    val labs: List<Lab>
)

data class Medications(
    val medicationsClasses: List<MedicationsClasses>
)

data class MedicationsClasses(
    val className: List<ClassName>,
    val className2: List<ClassName>
)

data class ClassName(
    val associatedDrug: List<Drug>,
    val associatedDrug2: List<Drug>
)

data class Drug(
    val name: String,
    val dose: String,
    val strength: String
)

data class Asthma(val dummy: String? = null)

data class Lab(val missing_field: String? = null)
