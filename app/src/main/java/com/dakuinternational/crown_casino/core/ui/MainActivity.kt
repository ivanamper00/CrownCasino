package com.dakuinternational.crown_casino.core.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.onNavDestinationSelected
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.dakuinternational.common.base.BaseActivity
import com.dakuinternational.common.event.UiEvent
import com.dakuinternational.common.ui.ActivityEvent
import com.dakuinternational.common.ui.ActivityViewModel
import com.dakuinternational.crown_casino.R
import com.dakuinternational.crown_casino.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<ActivityViewModel>()
    private val navHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
    }
    private val navController get() = navHostFragment.navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = LayoutInflater.from(this)
        binding = ActivityMainBinding.inflate(inflater, null, false)
        setContentView(binding.root)

        setupWithNavController(binding.bottomNavigationView, navController)
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId != binding.bottomNavigationView.selectedItemId) onNavDestinationSelected(
                item,
                navController
            )
            true
        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            setHideBottomNav(destination.id == R.id.splashFragment)
        }

        viewModel.activityEvent.observe(this){
            when(it){
                is UiEvent.Loading -> showLoading(it.isLoading)
                is ActivityEvent.SplashDone -> navController.navigate(R.id.dashboardFragment)
            }
        }
    }

    private fun setHideBottomNav(isHidden: Boolean) {
        binding.bottomNavigationView.visibility = if (isHidden) View.GONE else View.VISIBLE
    }
}