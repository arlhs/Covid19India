package com.arlhs.casesTracker.fragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.arlhs.casesTracker.R
import com.arlhs.casesTracker.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentHomeBinding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        binding.covid19casesImageView.setOnClickListener { view: View ->
//            binding.casesProgressBar.visibility = View.VISIBLE
            view.findNavController().navigate(R.id.action_homeFragment_to_casesFragment)
        }

        binding.vaccinationImageView.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_vaccinationFragment)
        }

        //Dot menu/ Toolbar menu set Enable
        setHasOptionsMenu(true)
        return binding.root
    }

    // Dot / Toolbar Menu Layout Inflater
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.dot_menu, menu)
    }

    // Dot / Toolbar Menu OnSelectItem Implementation
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.share_toolbar -> {
                try {
                    val intent = Intent(Intent.ACTION_SEND)
                    intent.type = "text/plain"
                    val subject = "Covid-19 Tracker"
                    val text = "https://play.google.com/store/apps/details?id" + requireContext().packageName
                    intent.putExtra(Intent.EXTRA_SUBJECT, subject)
                        intent.putExtra(Intent.EXTRA_TEXT, text)
                    startActivity(Intent.createChooser(intent, "Share With "))
                }
                catch (e: Exception){
                    Toast.makeText(context, "unable to Share", Toast.LENGTH_SHORT).show()
                }
            }
        }
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

}