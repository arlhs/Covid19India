package com.example.covid19india.helper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19india.databinding.CasesCardviewListBinding
import com.example.covid19india.databinding.VaccinationViewListBinding
import com.example.covid19india.model.VaccinationCount

class VaccinationRecyclerAdapter(private val vaccinationList: ArrayList<VaccinationCount>): RecyclerView.Adapter<RecyclerView.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
     return VaccinationViewHolder(
         VaccinationViewListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
     )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is VaccinationViewHolder -> {
                holder.bind(vaccinationList[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return vaccinationList.size
    }

    class VaccinationViewHolder(binding: VaccinationViewListBinding): RecyclerView.ViewHolder(binding.root)
    {
        private val population = binding.populationCountTextView
        private val vaccination1 = binding.dose1CountTextView
        private val vaccination2 = binding.dose2CountTextView
        private val stateName = binding.vaccStateNameTextView
        private val totalDose = binding.totalCountVacTextView

        fun bind(vaccinationList: VaccinationCount){

            population.text = vaccinationList.population.toString()
            vaccination1.text = vaccinationList.vaccinated1.toString()
            vaccination2.text = vaccinationList.vaccinated2.toString()
            stateName.text = vaccinationList.state
            totalDose.text = (vaccinationList.vaccinated1 + vaccinationList.vaccinated2).toString()
        }
    }

}