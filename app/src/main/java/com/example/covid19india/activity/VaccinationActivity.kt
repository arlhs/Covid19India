package com.example.covid19india.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19india.R
import com.example.covid19india.helper.VaccinationRecyclerAdapter
import com.example.covid19india.model.CovidDetails
import com.example.covid19india.model.VaccinationCount
import com.example.covid19india.service.VaccinationList
import com.example.covid19india.service.CasesService
import com.example.covid19india.service.ServiceBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList


class VaccinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccination)
    }

    override fun onResume() {
        super.onResume()

        loadDetails()
    }

    private fun loadDetails()
    {
        val covidDetails = ServiceBuilder.buildService(CasesService::class.java)
        val requestCall: Call<CovidDetails> = covidDetails.getCovidDetails()

        requestCall.enqueue(object : Callback<CovidDetails> {
            override fun onResponse(call: Call<CovidDetails>, response: Response<CovidDetails>) {

                if(response.isSuccessful){
                    Log.v("Vac Response Successful", response.code().toString())

                    val details: CovidDetails = response.body()!!
                    val vaccinationDetails: ArrayList<VaccinationCount> = VaccinationList.getList(details)
                    val recyclerView = findViewById<RecyclerView>(R.id.vaccination_recycler_view)

                    recyclerView.layoutManager = LinearLayoutManager(this@VaccinationActivity)
                    recyclerView.adapter = VaccinationRecyclerAdapter(vaccinationDetails)

                }
            }

            override fun onFailure(call: Call<CovidDetails>, t: Throwable) {
                Log.e("Vaccination Activity", "On Failure"+t.message)

            }

        })
    }
}