package com.arlhs.casesTracker.model

data class Total(
    val confirmed: Int,
    val deceased: Int,
    val recovered: Int,
    val tested: Int,
    val vaccinated1: Int,
    val vaccinated2: Int
)
