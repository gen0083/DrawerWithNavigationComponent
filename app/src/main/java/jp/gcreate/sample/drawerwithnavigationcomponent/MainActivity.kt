package jp.gcreate.sample.drawerwithnavigationcomponent

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        
        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open,
            R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        
        nav_view.setNavigationItemSelectedListener(this)
    }
    
    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
    
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera    -> {
                // Handle the camera action
            }
            
            R.id.nav_gallery   -> {
            
            }
            
            R.id.nav_slideshow -> {
            
            }
            
            R.id.nav_manage    -> {
            
            }
            
            R.id.nav_share     -> {
            
            }
            
            R.id.nav_send      -> {
            
            }
        }
        
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
