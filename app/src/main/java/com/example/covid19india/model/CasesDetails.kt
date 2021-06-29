package com.example.covid19india.model

import com.example.covid19india.Tested

data class CasesDetails(
    val stateName: String?,
    val confirmed: Int,
    val recovered: Int,
    val deceased: Int,
    val deltaConfirmed: Int? = 0,
    val deltaRecovered: Int? = 0,
    val deltaDeceased: Int? = 0,
    val tested: Int,
    val deltaTested: Int? = 0
)
