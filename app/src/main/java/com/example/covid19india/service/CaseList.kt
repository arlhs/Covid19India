package com.example.covid19india.service

import com.example.covid19india.model.CasesDetails
import com.example.covid19india.model.CovidDetails
import com.example.covid19india.model.TotalCount

object CaseList {

    fun getList(covidDetails: CovidDetails): ArrayList<CasesDetails> {
        val casesDetails =  ArrayList<CasesDetails>()
        val stateName = StateCodeHashMap.createHashMap()

        casesDetails.add(CasesDetails(stateName["AR"], covidDetails.AN.total.confirmed, covidDetails.AN.total.recovered, covidDetails.AN.total.recovered, covidDetails.AN.delta?.confirmed, covidDetails.AN.delta?.recovered, covidDetails.AN.delta?.deceased, covidDetails.AN.total.tested, covidDetails.AN.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["AP"], covidDetails.AP.total.confirmed, covidDetails.AP.total.recovered, covidDetails.AP.total.recovered, covidDetails.AP.delta?.confirmed, covidDetails.AP.delta?.recovered, covidDetails.AP.delta?.deceased, covidDetails.AP.total.tested, covidDetails.AP.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["AR"], covidDetails.AR.total.confirmed, covidDetails.AR.total.recovered, covidDetails.AR.total.recovered, covidDetails.AR.delta?.confirmed, covidDetails.AR.delta?.recovered, covidDetails.AR.delta?.deceased, covidDetails.AR.total.tested, covidDetails.AR.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["AS"], covidDetails.AS.total.confirmed, covidDetails.AS.total.recovered, covidDetails.AS.total.recovered, covidDetails.AS.delta?.confirmed, covidDetails.AS.delta?.recovered, covidDetails.AS.delta?.deceased, covidDetails.AS.total.tested, covidDetails.AS.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["BR"], covidDetails.BR.total.confirmed, covidDetails.BR.total.recovered, covidDetails.BR.total.recovered, covidDetails.BR.delta?.confirmed, covidDetails.BR.delta?.recovered, covidDetails.BR.delta?.deceased, covidDetails.BR.total.tested, covidDetails.BR.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["CH"], covidDetails.CH.total.confirmed, covidDetails.CH.total.recovered, covidDetails.CH.total.recovered, covidDetails.CH.delta?.confirmed, covidDetails.CH.delta?.recovered, covidDetails.CH.delta?.deceased, covidDetails.CH.total.tested, covidDetails.CH.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["CT"], covidDetails.CT.total.confirmed, covidDetails.CT.total.recovered, covidDetails.CT.total.recovered, covidDetails.CT.delta?.confirmed, covidDetails.CT.delta?.recovered, covidDetails.CT.delta?.deceased, covidDetails.CT.total.tested, covidDetails.CT.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["DL"], covidDetails.DL.total.confirmed, covidDetails.DL.total.recovered, covidDetails.DL.total.recovered, covidDetails.DL.delta?.confirmed, covidDetails.DL.delta?.recovered, covidDetails.DL.delta?.deceased, covidDetails.DL.total.tested, covidDetails.DL.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["DN"], covidDetails.DN.total.confirmed, covidDetails.DN.total.recovered, covidDetails.DN.total.recovered, covidDetails.DN.delta?.confirmed, covidDetails.DN.delta?.recovered, covidDetails.DN.delta?.deceased, covidDetails.DN.total.tested, covidDetails.DN.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["GA"], covidDetails.GA.total.confirmed, covidDetails.GA.total.recovered, covidDetails.GA.total.recovered, covidDetails.GA.delta?.confirmed, covidDetails.GA.delta?.recovered, covidDetails.GA.delta?.deceased, covidDetails.GA.total.tested, covidDetails.GA.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["GJ"], covidDetails.GJ.total.confirmed, covidDetails.GJ.total.recovered, covidDetails.GJ.total.recovered, covidDetails.GJ.delta?.confirmed, covidDetails.GJ.delta?.recovered, covidDetails.GJ.delta?.deceased, covidDetails.GJ.total.tested, covidDetails.GJ.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["HP"], covidDetails.HP.total.confirmed, covidDetails.HP.total.recovered, covidDetails.HP.total.recovered, covidDetails.HP.delta?.confirmed, covidDetails.HP.delta?.recovered, covidDetails.HP.delta?.deceased, covidDetails.HP.total.tested, covidDetails.HP.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["HR"], covidDetails.HR.total.confirmed, covidDetails.HR.total.recovered, covidDetails.HR.total.recovered, covidDetails.HR.delta?.confirmed, covidDetails.HR.delta?.recovered, covidDetails.HR.delta?.deceased, covidDetails.HR.total.tested, covidDetails.HR.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["JH"], covidDetails.JH.total.confirmed, covidDetails.JH.total.recovered, covidDetails.JH.total.recovered, covidDetails.JH.delta?.confirmed, covidDetails.JH.delta?.recovered, covidDetails.JH.delta?.deceased, covidDetails.JH.total.tested, covidDetails.JH.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["JK"], covidDetails.JK.total.confirmed, covidDetails.JK.total.recovered, covidDetails.JK.total.recovered, covidDetails.JK.delta?.confirmed, covidDetails.JK.delta?.recovered, covidDetails.JK.delta?.deceased, covidDetails.JK.total.tested, covidDetails.JK.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["KA"], covidDetails.KA.total.confirmed, covidDetails.KA.total.recovered, covidDetails.KA.total.recovered, covidDetails.KA.delta?.confirmed, covidDetails.KA.delta?.recovered, covidDetails.KA.delta?.deceased, covidDetails.KA.total.tested, covidDetails.KA.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["KL"], covidDetails.KL.total.confirmed, covidDetails.KL.total.recovered, covidDetails.KL.total.recovered, covidDetails.KL.delta?.confirmed, covidDetails.KL.delta?.recovered, covidDetails.KL.delta?.deceased, covidDetails.KL.total.tested, covidDetails.KL.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["LA"], covidDetails.LA.total.confirmed, covidDetails.LA.total.recovered, covidDetails.LA.total.recovered, covidDetails.LA.delta?.confirmed, covidDetails.LA.delta?.recovered, covidDetails.LA.delta?.deceased, covidDetails.LA.total.tested, covidDetails.LA.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["LD"], covidDetails.LD.total.confirmed, covidDetails.LD.total.recovered, covidDetails.LD.total.recovered, covidDetails.LD.delta?.confirmed, covidDetails.LD.delta?.recovered, covidDetails.LD.delta?.deceased, covidDetails.LD.total.tested, covidDetails.LD.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["MH"], covidDetails.MH.total.confirmed, covidDetails.MH.total.recovered, covidDetails.MH.total.recovered, covidDetails.MH.delta?.confirmed, covidDetails.MH.delta?.recovered, covidDetails.MH.delta?.deceased, covidDetails.MH.total.tested, covidDetails.MH.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["ML"], covidDetails.ML.total.confirmed, covidDetails.ML.total.recovered, covidDetails.ML.total.recovered, covidDetails.ML.delta?.confirmed, covidDetails.ML.delta?.recovered, covidDetails.ML.delta?.deceased, covidDetails.ML.total.tested, covidDetails.ML.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["MN"], covidDetails.MN.total.confirmed, covidDetails.MN.total.recovered, covidDetails.MN.total.recovered, covidDetails.MN.delta?.confirmed, covidDetails.MN.delta?.recovered, covidDetails.MN.delta?.deceased, covidDetails.MN.total.tested, covidDetails.MN.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["MP"], covidDetails.MP.total.confirmed, covidDetails.MP.total.recovered, covidDetails.MP.total.recovered, covidDetails.MP.delta?.confirmed, covidDetails.MP.delta?.recovered, covidDetails.MP.delta?.deceased, covidDetails.MP.total.tested, covidDetails.MP.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["MZ"], covidDetails.MZ.total.confirmed, covidDetails.MZ.total.recovered, covidDetails.MZ.total.recovered, covidDetails.MZ.delta?.confirmed, covidDetails.MZ.delta?.recovered, covidDetails.MZ.delta?.deceased, covidDetails.MZ.total.tested, covidDetails.MZ.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["OR"], covidDetails.OR.total.confirmed, covidDetails.OR.total.recovered, covidDetails.OR.total.recovered, covidDetails.OR.delta?.confirmed, covidDetails.OR.delta?.recovered, covidDetails.OR.delta?.deceased, covidDetails.OR.total.tested, covidDetails.OR.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["PB"], covidDetails.PB.total.confirmed, covidDetails.PB.total.recovered, covidDetails.PB.total.recovered, covidDetails.PB.delta?.confirmed, covidDetails.PB.delta?.recovered, covidDetails.PB.delta?.deceased, covidDetails.PB.total.tested, covidDetails.PB.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["PY"], covidDetails.PY.total.confirmed, covidDetails.PY.total.recovered, covidDetails.PY.total.recovered, covidDetails.PY.delta?.confirmed, covidDetails.PY.delta?.recovered, covidDetails.PY.delta?.deceased, covidDetails.PY.total.tested, covidDetails.PY.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["RJ"], covidDetails.RJ.total.confirmed, covidDetails.RJ.total.recovered, covidDetails.RJ.total.recovered, covidDetails.RJ.delta?.confirmed, covidDetails.RJ.delta?.recovered, covidDetails.RJ.delta?.deceased, covidDetails.RJ.total.tested, covidDetails.RJ.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["SK"], covidDetails.SK.total.confirmed, covidDetails.SK.total.recovered, covidDetails.SK.total.recovered, covidDetails.SK.delta?.confirmed, covidDetails.SK.delta?.recovered, covidDetails.SK.delta?.deceased, covidDetails.SK.total.tested, covidDetails.SK.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["TG"], covidDetails.TG.total.confirmed, covidDetails.TG.total.recovered, covidDetails.TG.total.recovered, covidDetails.TG.delta?.confirmed, covidDetails.TG.delta?.recovered, covidDetails.TG.delta?.deceased, covidDetails.TG.total.tested, covidDetails.TG.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["TN"], covidDetails.TN.total.confirmed, covidDetails.TN.total.recovered, covidDetails.TN.total.recovered, covidDetails.TN.delta?.confirmed, covidDetails.TN.delta?.recovered, covidDetails.TN.delta?.deceased, covidDetails.TN.total.tested, covidDetails.TN.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["TR"], covidDetails.TR.total.confirmed, covidDetails.TR.total.recovered, covidDetails.TR.total.recovered, covidDetails.TR.delta?.confirmed, covidDetails.TR.delta?.recovered, covidDetails.TR.delta?.deceased, covidDetails.TR.total.tested, covidDetails.TR.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["UP"], covidDetails.UP.total.confirmed, covidDetails.UP.total.recovered, covidDetails.UP.total.recovered, covidDetails.UP.delta?.confirmed, covidDetails.UP.delta?.recovered, covidDetails.UP.delta?.deceased, covidDetails.UP.total.tested, covidDetails.UP.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["UT"], covidDetails.UT.total.confirmed, covidDetails.UT.total.recovered, covidDetails.UT.total.recovered, covidDetails.UT.delta?.confirmed, covidDetails.UT.delta?.recovered, covidDetails.UT.delta?.deceased, covidDetails.UT.total.tested, covidDetails.UT.delta?.tested ))
        casesDetails.add(CasesDetails(stateName["WB"], covidDetails.WB.total.confirmed, covidDetails.WB.total.recovered, covidDetails.WB.total.recovered, covidDetails.WB.delta?.confirmed, covidDetails.WB.delta?.recovered, covidDetails.WB.delta?.deceased, covidDetails.WB.total.tested, covidDetails.WB.delta?.tested ))

        return casesDetails
    }

    fun getTotal(covidDetails: CovidDetails): ArrayList<TotalCount> {

        val totalCount = ArrayList<TotalCount>()

        totalCount.add(TotalCount("Confirmed", covidDetails.TT.delta?.confirmed!!, covidDetails.TT.total.confirmed))
        totalCount.add(TotalCount("Recovered", covidDetails.TT.delta.recovered!!, covidDetails.TT.total.recovered))
        totalCount.add(TotalCount("Deceased", covidDetails.TT.delta.deceased!!, covidDetails.TT.total.deceased))
        totalCount.add(TotalCount("Tested", covidDetails.TT.delta.tested, covidDetails.TT.total.tested))

        return totalCount
    }
}