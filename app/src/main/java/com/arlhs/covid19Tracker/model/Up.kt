package com.arlhs.covid19Tracker.model

data class Up(
    val meta : Meta,
    val delta: Delta?,
    val total: Total
)
