package com.example.covid19india

data class Statewise(
    val active: String? = null,
    val confirmed: String? = null,
    val deaths: String? = null,
    val deltaconfirmed: String? = null,
    val deltadeaths: String? = null,
    val deltarecovered: String? = null,
    val lastupdatedtime: String? = null,
    val migratedother: String? = null,
    val recovered: String? = null,
    val state: String? = null,
    val statecode: String? = null,
    val statenotes: String? = null
)