package com.example.covid19india.service

import com.example.covid19india.CasesList
import com.example.covid19india.model.CovidDetails
import retrofit2.Call
import retrofit2.http.GET

interface CasesService {

    @GET("data.json")
    fun getCasesList(): Call<CasesList>

    @GET("v4/min/data.min.json")
    fun getCovidDetails(): Call<CovidDetails>

}