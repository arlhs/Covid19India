package com.arlhs.covid19Tracker.model

data class Delta(
    val confirmed: Int?,
    val deceased: Int?,
    val recovered: Int?,
    val tested: Int?
)
