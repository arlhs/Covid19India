package com.arlhs.covid19Tracker.model

data class Py(
    val meta : Meta,
    val delta: Delta?,
    val total: Total
)
