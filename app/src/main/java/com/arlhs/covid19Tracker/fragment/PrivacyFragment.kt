package com.arlhs.covid19Tracker.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.arlhs.covid19Tracker.R
import com.arlhs.covid19Tracker.databinding.FragmentPrivacyBinding

class PrivacyFragment : Fragment() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment using DataBindingUtil
        val binding = DataBindingUtil.inflate<FragmentPrivacyBinding>(inflater,R.layout.fragment_privacy, container, false)

        val url = "https://covid-19-tracker-32.flycricket.io/privacy.html"
        val webView = binding.privacyWebView
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)

       return binding.root
    }
}