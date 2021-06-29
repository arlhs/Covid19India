package com.example.covid19india

import com.google.gson.annotations.SerializedName

data class Tested(
    val dailyrtpcrsamplescollectedicmrapplication: String?,
    val firstdoseadministered: String?,
    val frontlineworkersvaccinated1stdose: String?,
    val frontlineworkersvaccinated2nddose: String?,
    val healthcareworkersvaccinated1stdose: String?,
    val healthcareworkersvaccinated2nddose: String?,
    val over45years1stdose: String?,
    val over45years2nddose: String?,
    val over60years1stdose: String?,
    val over60years2nddose: String?,
    val positivecasesfromsamplesreported: String?,
    @SerializedName("registration18-45years")
    val registration1845years: String?,
    val registrationabove45years: String?,
    val registrationflwhcw: String?,
    val registrationonline: String?,
    val registrationonspot: String?,
    val samplereportedtoday: String?,
    val seconddoseadministered: String?,
    val source: String?,
    val source2: String?,
    val source3: String?,
    val source4: String?,
    val testedasof: String?,
    val testsconductedbyprivatelabs: String?,
    @SerializedName("to60yearswithco-morbidities1stdose")
    val to60yearswithcomorbidities1stdose: String?,
    @SerializedName("to60yearswithco-morbidities2nddose")
    val to60yearswithcomorbidities2nddose: String?,
    val totaldosesadministered: String?,
    val totaldosesavailablewithstates: String?,
    val totaldosesinpipeline: String?,
    val totalindividualsregistered: String?,
    val totalindividualstested: String?,
    val totalindividualsvaccinated: String?,
    val totalpositivecases: String?,
    val totalrtpcrsamplescollectedicmrapplication: String?,
    val totalsamplestested: String?,
    val totalsessionsconducted: String?,
    val updatetimestamp: String?,
    val years1stdose: String?,
    val years2nddose: String?
)