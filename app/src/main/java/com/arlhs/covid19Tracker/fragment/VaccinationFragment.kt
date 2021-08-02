package com.arlhs.covid19Tracker.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.arlhs.covid19Tracker.R
import com.arlhs.covid19Tracker.databinding.FragmentVaccinationBinding
import com.arlhs.covid19Tracker.helper.VaccinationRecyclerAdapter
import com.arlhs.covid19Tracker.model.CovidDetails
import com.arlhs.covid19Tracker.model.VaccinationCount
import com.arlhs.covid19Tracker.service.CasesService
import com.arlhs.covid19Tracker.service.ServiceBuilder
import com.arlhs.covid19Tracker.service.VaccinationList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList


class VaccinationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentVaccinationBinding>(
            inflater,
            R.layout.fragment_vaccination,
            container,
            false
        )

        loadDetails(binding)

        return  binding.root
    }

    private fun loadDetails(binding: FragmentVaccinationBinding)
    {
        val covidDetails = ServiceBuilder.buildService(CasesService::class.java)
        val requestCall: Call<CovidDetails> = covidDetails.getCovidDetails()

        requestCall.enqueue(object : Callback<CovidDetails> {
            override fun onResponse(call: Call<CovidDetails>, response: Response<CovidDetails>) {

                if(response.isSuccessful){
                    Log.v("Vac Response Successful", response.code().toString())

                    val details: CovidDetails = response.body()!!
                    val vaccinationDetails: ArrayList<VaccinationCount> = VaccinationList.getList(details)
                    val recyclerView = binding.vaccinationRecyclerView

                    recyclerView.layoutManager = LinearLayoutManager(context)
                    recyclerView.adapter = VaccinationRecyclerAdapter(vaccinationDetails)

                }
            }

            override fun onFailure(call: Call<CovidDetails>, t: Throwable) {
                Log.e("Vaccination Activity", "On Failure"+t.message)
            }

        })
    }

}