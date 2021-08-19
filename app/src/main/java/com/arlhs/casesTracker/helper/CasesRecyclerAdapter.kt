package com.arlhs.casesTracker.helper

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.arlhs.casesTracker.databinding.CasesCardviewListBinding
import com.arlhs.casesTracker.model.CasesDetails

class CasesRecyclerAdapter(private var casesList: ArrayList<CasesDetails>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CasesViewHolder(
            CasesCardviewListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {

            is CasesViewHolder -> {
                holder.bind(casesList[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return casesList.size
    }

    fun submitList(newList: ArrayList<CasesDetails>){
        casesList = newList
    }
    fun updateData(newList: ArrayList<CasesDetails>){
        val oldList = casesList
        val diffUtil = CasesDiffUtils(oldList, newList)
        val diffResult = DiffUtil.calculateDiff(diffUtil)

        casesList = newList
        diffResult.dispatchUpdatesTo(this)
    }

    class CasesViewHolder constructor(binding: CasesCardviewListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val state = binding.stateTv
        private val tested: TextView = binding.testedCountTv
        private val confirmed = binding.confirmedCountTv
        private val recovered = binding.recoveredCountTv
        private val deceased = binding.deceasedCountTv
        private val deltaTested = binding.testedDeltaCountTv
        private val deltaConfirmed = binding.deltaConfirmedTv
        private val deltaRecovered = binding.deltaRecoveredTv
        private val deltaDeceased = binding.deltaDeceasedTv

        @SuppressLint("SetTextI18n")
        fun bind(caseList: CasesDetails) {

//            val activeNumber = caseList.confirmed+ caseList.deltaConfirmed!!

            state.text = caseList.stateName
            tested.text = caseList.tested.toString()
            confirmed.text = caseList.confirmed.toString()
            recovered.text = caseList.recovered.toString()
            deceased.text = caseList.deceased.toString()
            deltaConfirmed.text = "+" + (caseList.deltaConfirmed?.toString() ?: "0")
            deltaRecovered.text = "+" + (caseList.deltaRecovered?.toString() ?: "0")
            deltaDeceased.text = "+" + (caseList.deltaDeceased?.toString() ?: "0")
            deltaTested.text = "+" + (caseList.deltaTested?.toString() ?: "0")
        }
    }

    class CasesDiffUtils(
        private var oldCasesDetails: ArrayList<CasesDetails>,
        private var newCasesDetails: ArrayList<CasesDetails>
    ) : DiffUtil.Callback() {

        override fun getOldListSize(): Int {
            return oldCasesDetails.size
        }

        override fun getNewListSize(): Int {
            return newCasesDetails.size
        }

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return (oldCasesDetails[oldItemPosition].stateName == newCasesDetails[newItemPosition].stateName)
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

//            return oldCasesDetails[oldItemPosition] == newCasesDetails[newItemPosition]
            return when {
                oldCasesDetails[oldItemPosition].stateName != newCasesDetails[newItemPosition].stateName -> false
                oldCasesDetails[oldItemPosition].confirmed != newCasesDetails[newItemPosition].confirmed -> false
                oldCasesDetails[oldItemPosition].recovered != newCasesDetails[newItemPosition].recovered -> false
                else -> true
            }
        }
    }
}

/*
class CasesRecyclerAdapter<T>(context: Context, casesList: ArrayList<Cases>): ArrayAdapter<Cases>(context, 0, casesList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)

        var listview: View? = convertView
        if(listview == null){
            listview = LayoutInflater.from(context).inflate(R.layout.cases_details, parent, false)
        }

        var currentData: Cases? = getItem(position)

        val state = listview?.findViewById<TextView>(R.id.state)
        state?.text = currentData?.getState()

        val totalConfirmed = listview?.findViewById<TextView>(R.id.total_confirmed)
        totalConfirmed?.text = currentData?.getTotalConfirmed().toString()

        val totalDeceased = listview?.findViewById<TextView>(R.id.total_deceased)
        totalDeceased?.text = currentData?.getTotalConfirmed().toString()

        val totalRecovered = listview?.findViewById<TextView>(R.id.total_recovered)
        totalRecovered?.text = currentData?.getTotalRecovered().toString()

        val totalTested = listview?.findViewById<TextView>(R.id.total_tested)
        totalTested?.text = currentData?.getTotalTested().toString()

    }
}*/
