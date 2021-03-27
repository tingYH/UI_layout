package com.ck.test.cloudinterview_chengkai.ui.phone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.ck.test.cloudinterview_chengkai.R
import com.ck.test.cloudinterview_chengkai.databinding.PhoneFragmentBinding
import com.google.android.material.tabs.TabLayout


class PhoneFragment : Fragment() {



    private lateinit var viewModel: PhoneViewModel
    private lateinit var tab: TabLayout
    private var _binding: PhoneFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = PhoneFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PhoneViewModel::class.java)
        var viewPg = binding.viewPager

//        viewPg.adapter =  ViewPagerAdapter()
        tab = binding.tabLayout

        tab.addTab(tab.newTab().setText(resources.getString(R.string.tab_1)))
        tab.addTab(tab.newTab().setText(resources.getString(R.string.tab_2)))
        tab.setupWithViewPager(viewPg)

    }

}
