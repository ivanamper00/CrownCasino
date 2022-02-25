package com.dakuinternational.crown_casino.presentation.fragments

import android.os.Bundle
import android.view.View
import com.dakuinternational.crown_casino.presentation.adapter.ProcedureAdapter
import com.dakuinternational.crown_casino.components.delegate.EventFlow
import com.dakuinternational.crown_casino.components.SliderTransformer
import com.dakuinternational.common.DataContent
import com.dakuinternational.common.base.BaseFragment
import com.dakuinternational.common.binding.viewBinding
import com.dakuinternational.crown_casino.R
import com.dakuinternational.crown_casino.databinding.FragmentProceduresBinding


class ProceduresFragment : BaseFragment(R.layout.fragment_procedures), ProcedureAdapter.OnClickListener{

    val binding by viewBinding(FragmentProceduresBinding::bind)
    lateinit var procedureAdapter: ProcedureAdapter
    val delegate by lazy { requireActivity() as EventFlow }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        procedureAdapter = ProcedureAdapter(this)
        binding.viewPager.apply {
            adapter = procedureAdapter
            offscreenPageLimit = 3
            setPageTransformer(SliderTransformer(3))
        }
    }

    override fun onItemClick(content: DataContent) {
        delegate.description(content)
    }

}