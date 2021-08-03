package com.mityushov.carbsfatprotein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.mityushov.carbsfatprotein.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var mainActivityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)
        init()
    }

    private fun init() {
        val toggle = ActionBarDrawerToggle(this,
                                    mainActivityBinding.drawerLayout,
                                    mainActivityBinding.mainContentLayout.toolbar,
                                    R.string.open,
                                    R.string.close)
        mainActivityBinding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        mainActivityBinding.navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.id_drawer_main_menu_profile -> {
                Log.d(TAG, "Item \"Profile\" is pushed")
                Toast.makeText(this, "Item \"Profile\" is pushed", Toast.LENGTH_LONG).show()
            }

            R.id.id_drawer_main_menu_eating -> {
                Log.d(TAG, "Item \"Eating\" is pushed")
                Toast.makeText(this, "Item \"Eating\" is pushed", Toast.LENGTH_LONG).show()
            }

            R.id.id_drawer_main_menu_statistics -> {
                Log.d(TAG, "Item \"Statistics\" is pushed")
                Toast.makeText(this, "Item \"Statistics\" is pushed", Toast.LENGTH_LONG).show()
            }

            R.id.id_drawer_main_menu_training -> {
                Log.d(TAG, "Item \"Training\" is pushed")
                Toast.makeText(this, "Item \"Training\" is pushed", Toast.LENGTH_LONG).show()
            }

            R.id.id_drawer_main_menu_settings -> {
                Log.d(TAG, "Item \"Settings\" is pushed")
                Toast.makeText(this, "Item \"Settings\" is pushed", Toast.LENGTH_LONG).show()
            }

            R.id.id_drawer_main_menu_notifications -> {
                Log.d(TAG, "Item \"Notifications\" is pushed")
                Toast.makeText(this, "Item \"Notifications\" is pushed", Toast.LENGTH_LONG).show()
            }

            R.id.id_drawer_main_menu_about -> {
                Log.d(TAG, "Item \"About\" is pushed")
                Toast.makeText(this, "Item \"About\" is pushed", Toast.LENGTH_LONG).show()
            }
        }

        mainActivityBinding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

}