package com.arlhs.covid19Tracker.model

data class Dn(
    val meta : Meta,
    val delta: Delta?,
    val total: Total
)
