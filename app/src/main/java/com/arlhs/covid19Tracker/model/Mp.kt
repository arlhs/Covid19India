package com.arlhs.covid19Tracker.model

data class Mp(
    val meta : Meta,
    val delta: Delta?,
    val total: Total
)
