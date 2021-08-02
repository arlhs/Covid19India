package com.arlhs.covid19Tracker.model

data class VaccinationCount(
    val population: Int,
    val vaccinated1: Int,
    val vaccinated2: Int,
    val state: String?
)
