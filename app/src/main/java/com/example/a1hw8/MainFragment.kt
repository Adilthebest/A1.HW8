package com.example.a1hw8

import android.location.Location
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a1hw8.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    private var location = arrayListOf<lesson>()
    private var place = location
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return (binding.root)
    }

    private fun loadData() {

    }
}