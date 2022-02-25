package com.dakuinternational.crown_casino.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.dakuinternational.common.base.BaseFragment
import com.dakuinternational.common.binding.viewBinding
import com.dakuinternational.crown_casino.R
import com.dakuinternational.crown_casino.databinding.FragmentDescriptionBinding

class DescriptionFragment : BaseFragment(R.layout.fragment_description) {

    val binding by viewBinding(FragmentDescriptionBinding::bind)
    val args: DescriptionFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.description = args.dataContent
    }

}