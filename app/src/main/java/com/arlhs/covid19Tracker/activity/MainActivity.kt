package com.arlhs.covid19Tracker.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.arlhs.covid19Tracker.R
import com.arlhs.covid19Tracker.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // Adding Navigation Graph Fragment variable
        val navController = this.findNavController(R.id.HomeNavHostFragment)

        // Drawer menu Layout
        drawerLayout = binding.drawerLayout
        //Adding drawer menu
        NavigationUI.setupWithNavController(binding.drawerNavView, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        //Enabling of onClick listener on Drawer menu
//        binding.drawerNavView.setNavigationItemSelectedListener(this)

    }

    // Drawer Menu Navigation Up Button
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.HomeNavHostFragment)
        // Used for navigation up only
        // return  navController.navigateUp()

        // for drawer menu and navigation up
        return  NavigationUI.navigateUp(navController, drawerLayout)
    }

    //Drawer menu OnClickListener implementing Share button
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.share_drawer_menu -> {
                try {
                    val intent = Intent(Intent.ACTION_SEND)
                    intent.type = "text/plain"
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Covid-19 Tracker" )
                    intent.putExtra(Intent.EXTRA_TEXT, "www.www.www" )
                    startActivity(Intent.createChooser(intent, "Share With "))
                }
                catch (e: Exception){
                    Toast.makeText(this, "Unable to Share", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}