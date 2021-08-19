package com.arlhs.casesTracker.service

import com.arlhs.casesTracker.model.CovidDetails
import com.arlhs.casesTracker.model.VaccinationCount

object VaccinationList {

    fun getList(covidDetails: CovidDetails): ArrayList<VaccinationCount> {

        val vaccinationDetails = ArrayList<VaccinationCount>()
        val stateName = StateCodeHashMap.createHashMap()

        vaccinationDetails.add(VaccinationCount(covidDetails.TT.meta.population, covidDetails.TT.total.vaccinated1, covidDetails.TT.total.vaccinated2, "India"))
        vaccinationDetails.add(VaccinationCount(covidDetails.AN.meta.population, covidDetails.AN.total.vaccinated1, covidDetails.AN.total.vaccinated2, stateName["AN"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.AP.meta.population, covidDetails.AP.total.vaccinated1, covidDetails.AP.total.vaccinated2, stateName["AP"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.AR.meta.population, covidDetails.AR.total.vaccinated1, covidDetails.AR.total.vaccinated2, stateName["AR"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.AS.meta.population, covidDetails.AS.total.vaccinated1, covidDetails.AS.total.vaccinated2, stateName["AS"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.AR.meta.population, covidDetails.BR.total.vaccinated1, covidDetails.BR.total.vaccinated2, stateName["BR"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.CH.meta.population, covidDetails.CH.total.vaccinated1, covidDetails.CH.total.vaccinated2, stateName["CH"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.CT.meta.population, covidDetails.CT.total.vaccinated1, covidDetails.CT.total.vaccinated2, stateName["CT"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.DL.meta.population, covidDetails.DL.total.vaccinated1, covidDetails.DL.total.vaccinated2, stateName["DL"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.DN.meta.population, covidDetails.DN.total.vaccinated1, covidDetails.DN.total.vaccinated2, stateName["DN"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.GA.meta.population, covidDetails.GA.total.vaccinated1, covidDetails.GA.total.vaccinated2, stateName["GA"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.GJ.meta.population, covidDetails.GJ.total.vaccinated1, covidDetails.GJ.total.vaccinated2, stateName["GJ"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.HP.meta.population, covidDetails.HP.total.vaccinated1, covidDetails.HP.total.vaccinated2, stateName["HP"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.HR.meta.population, covidDetails.HR.total.vaccinated1, covidDetails.HR.total.vaccinated2, stateName["HR"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.JH.meta.population, covidDetails.JH.total.vaccinated1, covidDetails.JH.total.vaccinated2, stateName["JH"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.JK.meta.population, covidDetails.JK.total.vaccinated1, covidDetails.JK.total.vaccinated2, stateName["JK"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.KA.meta.population, covidDetails.KA.total.vaccinated1, covidDetails.KA.total.vaccinated2, stateName["KA"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.KL.meta.population, covidDetails.KL.total.vaccinated1, covidDetails.KL.total.vaccinated2, stateName["KL"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.LA.meta.population, covidDetails.LA.total.vaccinated1, covidDetails.LA.total.vaccinated2, stateName["LA"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.LD.meta.population, covidDetails.LD.total.vaccinated1, covidDetails.LD.total.vaccinated2, stateName["LD"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.MH.meta.population, covidDetails.MH.total.vaccinated1, covidDetails.MH.total.vaccinated2, stateName["MH"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.ML.meta.population, covidDetails.ML.total.vaccinated1, covidDetails.ML.total.vaccinated2, stateName["ML"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.MN.meta.population, covidDetails.MN.total.vaccinated1, covidDetails.MN.total.vaccinated2, stateName["MN"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.MP.meta.population, covidDetails.MP.total.vaccinated1, covidDetails.MP.total.vaccinated2, stateName["MP"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.MZ.meta.population, covidDetails.MZ.total.vaccinated1, covidDetails.MZ.total.vaccinated2, stateName["MZ"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.NL.meta.population, covidDetails.NL.total.vaccinated1, covidDetails.NL.total.vaccinated2, stateName["NL"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.OR.meta.population, covidDetails.OR.total.vaccinated1, covidDetails.OR.total.vaccinated2, stateName["OR"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.PB.meta.population, covidDetails.PB.total.vaccinated1, covidDetails.PB.total.vaccinated2, stateName["PB"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.PY.meta.population, covidDetails.PY.total.vaccinated1, covidDetails.PY.total.vaccinated2, stateName["PY"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.RJ.meta.population, covidDetails.RJ.total.vaccinated1, covidDetails.RJ.total.vaccinated2, stateName["RJ"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.SK.meta.population, covidDetails.SK.total.vaccinated1, covidDetails.SK.total.vaccinated2, stateName["SK"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.TG.meta.population, covidDetails.TG.total.vaccinated1, covidDetails.TG.total.vaccinated2, stateName["TG"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.TN.meta.population, covidDetails.TN.total.vaccinated1, covidDetails.TN.total.vaccinated2, stateName["TN"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.TR.meta.population, covidDetails.TR.total.vaccinated1, covidDetails.TR.total.vaccinated2, stateName["TR"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.UP.meta.population, covidDetails.UP.total.vaccinated1, covidDetails.UP.total.vaccinated2, stateName["UP"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.UT.meta.population, covidDetails.UT.total.vaccinated1, covidDetails.UT.total.vaccinated2, stateName["UT"]))
        vaccinationDetails.add(VaccinationCount(covidDetails.WB.meta.population, covidDetails.WB.total.vaccinated1, covidDetails.WB.total.vaccinated2, stateName["WB"]))

        return vaccinationDetails

    }
}