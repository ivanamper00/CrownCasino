package com.dakuinternational.crown_casino.dashboard.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dakuinternational.common.base.BaseFragment
import com.dakuinternational.common.binding.viewBinding
import com.dakuinternational.common.ui.ActivityViewModel
import com.dakuinternational.common.ui.components.Assets
import com.dakuinternational.crown_casino.R
import com.dakuinternational.crown_casino.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment(R.layout.fragment_dashboard) {

    val binding by viewBinding(FragmentDashboardBinding::bind)
    private val viewModel by viewModels<ActivityViewModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.assets = Assets
        super.onViewCreated(view, savedInstanceState)
    }

}