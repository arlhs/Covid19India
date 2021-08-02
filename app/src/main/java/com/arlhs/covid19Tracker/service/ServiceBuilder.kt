package com.arlhs.covid19Tracker.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {

    private const val URL = "https://api.covid19india.org/"

    //creating okHttp client
    private val okHttp = OkHttpClient.Builder()

    //creating retrofit builder
    private val builder =
        Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).client(
            okHttp.build())

    //create instance of retrofit
    private val retrofit = builder.build()

    fun <T> buildService(serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }

}