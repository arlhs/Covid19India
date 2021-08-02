package com.arlhs.covid19Tracker.model

data class Tr(
    val meta : Meta,
    val delta: Delta?,
    val total: Total
)
