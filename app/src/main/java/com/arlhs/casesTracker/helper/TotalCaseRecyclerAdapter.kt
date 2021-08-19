package com.arlhs.casesTracker.helper

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arlhs.casesTracker.databinding.LayoutTotalBinding
import com.arlhs.casesTracker.model.TotalCount

class TotalCaseRecyclerAdapter(private val totalCountList: List<TotalCount>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = TotalCaseViewHolder(
            LayoutTotalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

        return binding
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is TotalCaseViewHolder -> holder.bind(totalCountList[position])
        }
    }

    override fun getItemCount(): Int {
        return totalCountList.size
    }

    class TotalCaseViewHolder(binding: LayoutTotalBinding): RecyclerView.ViewHolder(binding.root){

        private val totalName = binding.totalTextView
        val totalDeltaCount = binding.totalDeltaCountTextView
        val totalCount = binding.totalCountTextView

        @SuppressLint("SetTextI18n")
        fun bind(total: TotalCount){

            totalName.text = total.totalName
            totalDeltaCount.text = "+" + (total.deltaCount?.toString() ?: "0")
            totalCount.text = total.count.toString()

            when (total.totalName) {
                "Confirmed" -> {
                    totalDeltaCount.setTextColor(Color.parseColor("#D32F2F"))
                }
                "Recovered" -> {
                    totalDeltaCount.setTextColor(Color.parseColor("#4CAF50"))
                }
                "Deceased" -> {
                    totalDeltaCount.setTextColor((Color.parseColor("#000000")))
                }
            }
        }

    }
}