package com.arlhs.casesTracker.model

data class VaccinationCount(
    val population: Int,
    val vaccinated1: Int,
    val vaccinated2: Int,
    val state: String?
)
