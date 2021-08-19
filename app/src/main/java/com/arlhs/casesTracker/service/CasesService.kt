package com.arlhs.casesTracker.service

import com.arlhs.casesTracker.model.CovidDetails
import retrofit2.Call
import retrofit2.http.GET

interface CasesService {

    @GET("v4/min/data.min.json")
    fun getCovidDetails(): Call<CovidDetails>

}