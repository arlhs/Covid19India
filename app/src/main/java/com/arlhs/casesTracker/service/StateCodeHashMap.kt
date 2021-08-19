package com.arlhs.casesTracker.service

object StateCodeHashMap {

    fun createHashMap(): HashMap<String, String> {

        val stateWithCode = HashMap<String, String>()

        stateWithCode["AN"] = "Andaman and Nicobar Islands"
        stateWithCode["AP"] = "Andhra Pradesh"
        stateWithCode["AR"] = "Arunachal Pradesh"
        stateWithCode["AS"] = "Assam"
        stateWithCode["BR"] = "Bihar"
        stateWithCode["CH"] = "Chandigarh"
        stateWithCode["CT"] = "Chhattisgarh"
        stateWithCode["DN"] = "Dadra and Nagar Haveli and Daman and Diu"
        stateWithCode["DL"] = "Delhi"
        stateWithCode["GA"] = "Goa"
        stateWithCode["GJ"] = "Gujarat"
        stateWithCode["HR"] = "Haryana"
        stateWithCode["HP"] = "Himachal Pradesh"
        stateWithCode["JH"] = "Jharkhand"
        stateWithCode["JK"] = "Jammu and Kashmir"
        stateWithCode["KA"] = "Karnataka"
        stateWithCode["KL"] = "Kerala"
        stateWithCode["LA"] = "Ladakh"
        stateWithCode["LD"] = "Lakshadweep"
        stateWithCode["MH"] = "Maharashtra"
        stateWithCode["MP"] = "Madhya Pradesh"
        stateWithCode["MN"] = "Manipur"
        stateWithCode["ML"] = "Meghalaya"
        stateWithCode["MZ"] = "Mizoram"
        stateWithCode["NL"] = "Nagaland"
        stateWithCode["OR"] = "Odisha"
        stateWithCode["PY"] = "Pondicherry"
        stateWithCode["PB"] = "Punjab"
        stateWithCode["RJ"] = "Rajasthan"
        stateWithCode["SK"] = "Sikkim"
        stateWithCode["TN"] = "Tamil Nadu"
        stateWithCode["TG"] = "Telangana"
        stateWithCode["TR"] = "Tripura"
        stateWithCode["TT"] = "Total"
        stateWithCode["UP"] = "Uttar Pradesh"
        stateWithCode["UT"] = "Uttarakhand"
        stateWithCode["WB"] = "West Bengal"

        return stateWithCode
    }

}