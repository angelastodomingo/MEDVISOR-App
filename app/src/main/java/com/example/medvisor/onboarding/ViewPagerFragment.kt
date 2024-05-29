package com.example.medvisor.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medvisor.R
import com.example.medvisor.onboarding.screens.FirstScreen
import com.example.medvisor.onboarding.screens.SecondScreen
import com.example.medvisor.onboarding.screens.ThirdScreen
import com.example.medvisor.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {


    // Declare the binding variable at the class level
    private var _binding: FragmentViewPagerBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val view = binding.root


        val fragmentList = arrayListOf(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )


        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )


        binding.viewPager2.adapter = adapter

        return view
    }

}