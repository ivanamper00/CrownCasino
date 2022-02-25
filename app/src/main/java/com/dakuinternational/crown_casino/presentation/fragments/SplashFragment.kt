package com.dakuinternational.crown_casino.presentation.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.dakuinternational.common.R
import com.dakuinternational.common.base.BaseFragment
import com.dakuinternational.common.binding.viewBinding
import com.dakuinternational.common.databinding.FragmentSplashBinding
import com.dakuinternational.common.ui.ActivityViewModel
import com.dakuinternational.common.ui.components.Assets

class SplashFragment : BaseFragment(R.layout.fragment_splash) {

    private val binding by viewBinding(FragmentSplashBinding::bind)
    private lateinit var viewModel: ActivityViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.assets = Assets
        viewModel = ViewModelProvider(requireActivity())[ActivityViewModel::class.java]

        val timer = object: CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) { }
            override fun onFinish() {
                viewModel.SplashDone()
            }
        }
        timer.start()
    }

}