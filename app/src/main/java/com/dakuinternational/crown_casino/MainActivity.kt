package com.dakuinternational.crown_casino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.dakuinternational.common.base.BaseActivity
import com.dakuinternational.common.binding.viewBinding
import com.dakuinternational.common.event.UiEvent
import com.dakuinternational.crown_casino.databinding.ActivityMainBinding

class MainActivity : BaseActivity(R.layout.activity_main) {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val viewModel by viewModels<ActivityViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)


        viewModel.activityEvent.observe(this){
            when(it){
                is UiEvent.Loading -> showLoading(it.isLoading)
            }
        }
    }
}