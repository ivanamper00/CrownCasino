package com.dakuinternational.crown_casino.presentation.fragments

import android.os.Bundle
import android.view.View
import com.dakuinternational.common.base.BaseFragment
import com.dakuinternational.common.binding.viewBinding
import com.dakuinternational.crown_casino.R
import com.dakuinternational.crown_casino.databinding.FragmentRulesBinding
import com.dakuinternational.crown_casino.domain.SicboAssets


class RulesFragment : BaseFragment(R.layout.fragment_rules) {

    val binding by viewBinding(FragmentRulesBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rules = SicboAssets.rules
    }

}