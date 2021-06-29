package com.example.covid19india.model

import java.lang.StringBuilder

data class VaccinationCount(
    val population: Int,
    val vaccinated1: Int,
    val vaccinated2: Int,
    val state: String?
)
