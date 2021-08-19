package com.arlhs.casesTracker.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.arlhs.casesTracker.R
import com.arlhs.casesTracker.databinding.FragmentCasesBinding
import com.arlhs.casesTracker.helper.CasesRecyclerAdapter
import com.arlhs.casesTracker.helper.TotalCaseRecyclerAdapter
import com.arlhs.casesTracker.model.CasesDetails
import com.arlhs.casesTracker.model.CovidDetails
import com.arlhs.casesTracker.model.TotalCount
import com.arlhs.casesTracker.service.CaseList
import com.arlhs.casesTracker.service.CasesService
import com.arlhs.casesTracker.service.ServiceBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CasesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentCasesBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_cases, container, false
        )

        loadCases(binding)

        return binding.root
    }

    private fun loadCases(binding: FragmentCasesBinding) {

        val casesService = ServiceBuilder.buildService(CasesService::class.java)

        val requestCall: Call<CovidDetails> = casesService.getCovidDetails()

        requestCall.enqueue(object : Callback<CovidDetails> {
            override fun onResponse(call: Call<CovidDetails>, response: Response<CovidDetails>) {

                if (response.isSuccessful) {

                    Log.v("Cases Response", response.code().toString())
                    val details = response.body()!!
                    val casesDetails: ArrayList<CasesDetails> = CaseList.getList(details)
                    val total: ArrayList<TotalCount> = CaseList.getTotal(details)
                    val casesRecyclerView = binding.casesRecyclerView
                    val totalRecyclerView = binding.totalRecyclerView

                    // SortByList function
                    casesDetails.sortByDescending { it.deltaConfirmed }
                    sortListBy(binding, casesDetails)

                    // cases fragment Recycler view state wise
                    casesRecyclerView.layoutManager = LinearLayoutManager(context)
                    casesRecyclerView.adapter = CasesRecyclerAdapter(casesDetails)

                    // Updating Sorted data-- Breaking the app
                    /*val sortedCasesDetails = casesDetails.sortedBy { it.stateName }
                    Log.i("sortedListSize", sortedCasesDetails.size.toString() )
                    CasesRecyclerAdapter(casesDetails).updateData(sortedCasesDetails as ArrayList<CasesDetails>)*/

                    // Total cases details of whole India
                    totalRecyclerView.layoutManager =
                        LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                    totalRecyclerView.adapter = TotalCaseRecyclerAdapter(total)

                } else {
                    // Toast
                    Log.v("Response Cases Failed", "t------")

                }
            }

            override fun onFailure(call: Call<CovidDetails>, t: Throwable) {
                Log.e("Covid19Cases Activity", "On Failure" + t.message)
            }

        })
    }

    private fun sortListBy(
        binding: FragmentCasesBinding,
        casesDetails: ArrayList<CasesDetails>,
    ) {

        val sortBy = resources.getStringArray(R.array.SortBy)
        val arrayAdapter =
            ArrayAdapter(requireContext(), R.layout.drop_down_menu, sortBy)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
        binding.autoCompleteTextView.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->

                when (position) {
                    0 -> {
                        casesDetails.sortBy { it.stateName }
                        Log.i("position", position.toString())
                    }

                    1 -> {
                        casesDetails.sortByDescending { it.deltaConfirmed }
                        Log.i(
                            "position",
                            casesDetails.sortedByDescending { it.confirmed }.size.toString()
                        )
                    }

                    2 -> {
                        casesDetails.sortByDescending { it.deltaRecovered }
                        Log.i("position", position.toString())
                    }

                    3 -> {
                        casesDetails.sortByDescending { it.deltaTested }
                    }

                    4 -> {
                        casesDetails.sortByDescending { it.deltaDeceased }
                    }
                    else -> {
                        casesDetails.sortByDescending { it.deltaConfirmed }
                    }
                }
            }
    }
}