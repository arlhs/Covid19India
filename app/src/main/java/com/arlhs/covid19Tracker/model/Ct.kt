package com.arlhs.covid19Tracker.model

data class Ct(
    val meta : Meta,
    val delta: Delta?,
    val total: Total
)