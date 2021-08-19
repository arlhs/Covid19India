package com.arlhs.casesTracker.helper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arlhs.casesTracker.databinding.VaccinationViewListBinding
import com.arlhs.casesTracker.model.VaccinationCount

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

            population.text = if(vaccinationList.population>=10000000)
                                    (String.format("%.2f", vaccinationList.population*1.0/10000000)) + " Cr"
                            else
                                    String.format("%.2f", vaccinationList.population*1.0/1000000) + " L"

            vaccination1.text = if(vaccinationList.vaccinated1>=10000000)
                (String.format("%.2f", vaccinationList.vaccinated1*1.0/10000000)) + " Cr"
            else
                String.format("%.2f", vaccinationList.vaccinated1*1.0/1000000) + " L"

            vaccination2.text = if(vaccinationList.vaccinated2>=10000000)
                (String.format("%.2f", vaccinationList.vaccinated2*1.0/10000000)) + " Cr"
            else
                String.format("%.2f", vaccinationList.vaccinated2*1.0/1000000) + " L"

            stateName.text = vaccinationList.state

            val total = vaccinationList.vaccinated1 + vaccinationList.vaccinated2

            totalDose.text = if(total>=10000000)
                (String.format("%.2f", total*1.0/10000000)) + " Cr"
            else
                String.format("%.2f", total*1.0/1000000) + " L"
        }
    }

}