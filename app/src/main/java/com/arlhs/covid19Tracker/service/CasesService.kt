package com.arlhs.covid19Tracker.service

import com.arlhs.covid19Tracker.model.CovidDetails
import retrofit2.Call
import retrofit2.http.GET

interface CasesService {

    @GET("v4/min/data.min.json")
    fun getCovidDetails(): Call<CovidDetails>

}