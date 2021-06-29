package com.example.covid19india.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.example.covid19india.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val covid19Cases = findViewById<ImageView>(R.id.covid19cases_image_view)

        covid19Cases.setOnClickListener() {
            Toast.makeText(this@MainActivity, "Covid-19 Cases", Toast.LENGTH_SHORT).show()

            val intent = Intent(this@MainActivity, Covid19CasesActivity::class.java).apply { }
            startActivity(intent)
        }

        val vaccinationCount = findViewById<ImageView>(R.id.vaccination_image_view)

        vaccinationCount.setOnClickListener() {
            Toast.makeText(this@MainActivity, "Vaccination", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, VaccinationActivity::class.java).apply {  }
            startActivity(intent)

        }
    }
}