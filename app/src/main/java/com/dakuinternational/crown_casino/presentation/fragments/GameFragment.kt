package com.dakuinternational.crown_casino.presentation.fragments

import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.dakuinternational.crown_casino.domain.SicboAssets
import com.dakuinternational.common.base.BaseFragment
import com.dakuinternational.common.binding.viewBinding
import com.dakuinternational.crown_casino.R
import com.dakuinternational.crown_casino.databinding.FragmentGameBinding

class GameFragment : BaseFragment(R.layout.fragment_game) {

    val binding by viewBinding(FragmentGameBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.game = SicboAssets.about
    }

}