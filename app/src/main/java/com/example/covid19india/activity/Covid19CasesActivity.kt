package com.example.covid19india.activity

import android.graphics.drawable.ClipDrawable.HORIZONTAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout.HORIZONTAL
import android.widget.LinearLayout.HORIZONTAL
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19india.CasesList
import com.example.covid19india.R
import com.example.covid19india.Statewise
import com.example.covid19india.helper.CasesRecyclerAdapter
import com.example.covid19india.helper.TotalCaseRecyclerAdapter
import com.example.covid19india.model.CasesDetails
import com.example.covid19india.model.CovidDetails
import com.example.covid19india.model.TotalCount
import com.example.covid19india.service.CaseList
import com.example.covid19india.service.CasesService
import com.example.covid19india.service.ServiceBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Covid19CasesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid19_cases)

//        textView = findViewById(R.id.test)
/*
        CheckConnection().execute("https://api.covid19india.org/v4/min/data.min.json")
*/

//        //casesDetails = ArrayList<Cases>()
//        val listView = findViewById<ListView>(R.id.cases_list_view)
//        val listAdapter = CasesAdapter<Cases>(this@Covid19CasesActivity, casesDetails)
//        listView.adapter = listAdapter

        //Companion.textView = findViewById(R.id.text_view)
    }

    override fun onResume() {
        super.onResume()

        loadCases()
    }

    private fun loadCases() {

        val casesService = ServiceBuilder.buildService(CasesService::class.java)

        val requestCall: Call<CovidDetails> = casesService.getCovidDetails()

        requestCall.enqueue(object : Callback<CovidDetails> {
            override fun onResponse(call: Call<CovidDetails>, response: Response<CovidDetails>) {

                if (response.isSuccessful) {

                    Log.v("Cases Response", response.code().toString())
                    val details = response.body()!!
                    val casesDetails: ArrayList<CasesDetails> = CaseList.getList(details)
                    val total: ArrayList<TotalCount> = CaseList.getTotal(details)
                    val casesRecyclerView = findViewById<RecyclerView>(R.id.cases_recycler_view)
                    val totalRecyclerView = findViewById<RecyclerView>(R.id.total_recycler_view)

                    casesDetails.sortWith( Comparator { s1: CasesDetails, s2: CasesDetails -> return@Comparator s2.confirmed - s1.confirmed })

                    casesRecyclerView.layoutManager = LinearLayoutManager(this@Covid19CasesActivity)
                    casesRecyclerView.adapter = CasesRecyclerAdapter(casesDetails)

                    totalRecyclerView.layoutManager = LinearLayoutManager(this@Covid19CasesActivity, LinearLayoutManager.HORIZONTAL, false)
                    totalRecyclerView.adapter = TotalCaseRecyclerAdapter(total)
                } else {
                    // Toast
                    Log.v("Response Cases Failed", "t------")

                }

            }

            override fun onFailure(call: Call<CovidDetails>, t: Throwable) {
                Log.e("Covid19Cases Activity", "On Failure"+t.message)
            }

        })
    }


    /*class CheckConnection() : AsyncTask<String, Void, String>() {
        override fun doInBackground(vararg params: String?): String? {
            var url: URL? = null

            try {
                url = URL(params[0])
            } catch (e: MalformedURLException) {
                e.printStackTrace()
            }

            try {
                val urlConnection = url?.openConnection() as HttpURLConnection
                Log.i("Response", urlConnection.responseCode.toString())

                val inputStream = urlConnection.inputStream
                val bufferReader = BufferedReader(InputStreamReader(inputStream))
                val s = bufferReader.readLine()

                return s
            } catch (i: IOException) {
                Log.e("Error", i.toString())
            }

            return null

        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

            lateinit var jsonRootObject: JSONObject

            try {
                val stateWithCode: ArrayList<Pair<String, String>> = ArrayList()
                stateWithCode.add(Pair<String, String>("AN", "Andaman and Nicobar Islands"))
                stateWithCode.add(Pair<String, String>("AP", "Andhra Pradesh"))
                stateWithCode.add(Pair<String, String>("AR", "Arunachal Pradesh"))
                stateWithCode.add(Pair<String, String>("AS", "Assam"))
                stateWithCode.add(Pair<String, String>("BR", "Bihar"))
                stateWithCode.add(Pair<String, String>("CH", "Chandigarh"))
                stateWithCode.add(Pair<String, String>("CT", "Chhattisgarh"))
                stateWithCode.add(
                    Pair<String, String>(
                        "DN",
                        "Dadra and Nagar Haveli and Daman and Diu"
                    )
                )
                stateWithCode.add(Pair<String, String>("GA", "Goa"))
                stateWithCode.add(Pair<String, String>("GJ", "Gujarat"))
                stateWithCode.add(Pair<String, String>("HR", "Haryana"))
                stateWithCode.add(Pair<String, String>("HP", "Himachal Pradesh"))
                stateWithCode.add(Pair<String, String>("JK", "Jammu and Kashmir"))
                stateWithCode.add(Pair<String, String>("JH", "Jharkhand"))
                stateWithCode.add(Pair<String, String>("KA", "Karnataka"))
                stateWithCode.add(Pair<String, String>("KL", "Kerala"))
                stateWithCode.add(Pair<String, String>("LA", "Ladakh"))
                stateWithCode.add(Pair<String, String>("LD", "Lakshadweep"))
                stateWithCode.add(Pair<String, String>("MP", "Madhya Pradesh"))
                stateWithCode.add(Pair<String, String>("MH", "Maharashtra"))
                stateWithCode.add(Pair<String, String>("MN", "Manipur"))
                stateWithCode.add(Pair<String, String>("ML", "Meghalaya"))
                stateWithCode.add(Pair<String, String>("MZ", "Mizoram"))
                stateWithCode.add(Pair<String, String>("NL", "Nagaland"))
                stateWithCode.add(Pair<String, String>("OR", "Odisha"))
                stateWithCode.add(Pair<String, String>("PY", "Puducherry"))
                stateWithCode.add(Pair<String, String>("PB", "Punjab"))
                stateWithCode.add(Pair<String, String>("RJ", "Rajasthan"))
                stateWithCode.add(Pair<String, String>("SK", "Sikkim"))
                stateWithCode.add(Pair<String, String>("TN", "Tamil Nadu"))
                stateWithCode.add(Pair<String, String>("TG", "Telangana"))
                stateWithCode.add(Pair<String, String>("TR", "Tripura"))
                stateWithCode.add(Pair<String, String>("UP", "Uttar Pradesh"))
                stateWithCode.add(Pair<String, String>("UT", "Uttarakhand"))
                stateWithCode.add(Pair<String, String>("WB", "West Bengal"))

                // Reading JSON from string
                jsonRootObject = JSONObject(result.toString())


                for (stateCodeName in stateWithCode) {
                    val jsonStateObject = jsonRootObject.getJSONObject(stateCodeName.first)
                    val jsonTotalObject = jsonStateObject.getJSONObject("total")

                    val totalConfirmed = jsonTotalObject.getInt("confirmed")
                    val totalDeceased = jsonTotalObject.getInt("deceased")
                    val totalRecovered = jsonTotalObject.getInt("recovered")
                    val totalTested = jsonTotalObject.getInt("tested")
                    casesDetails.add(
                        Cases(
                            stateCodeName.second,
                            totalConfirmed,
                            totalDeceased,
                            totalRecovered,
                            totalTested,
                            0,
                            0,
                            0,
                            0,
                        )
                    )
                }

            } catch (e: JSONException) {
                e.printStackTrace()
            }

        }

    }


*/

}

private operator fun String?.minus(confirmed: String?): Int {
    return confirmed!!.toInt()
}
