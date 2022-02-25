package com.dakuinternational.crown_casino.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dakuinternational.common.base.BaseFragment
import com.dakuinternational.common.binding.viewBinding
import com.dakuinternational.crown_casino.R
import com.dakuinternational.crown_casino.databinding.FragmentAboutBinding

class AboutFragment : BaseFragment(R.layout.fragment_about) {

    val binding by viewBinding(FragmentAboutBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}