package com.arlhs.covid19Tracker.model

data class Wb(
    val meta : Meta,
    val delta: Delta?,
    val total: Total
)
