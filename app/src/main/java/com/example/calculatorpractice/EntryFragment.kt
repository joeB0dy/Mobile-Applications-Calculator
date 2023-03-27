package com.example.calculatorpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculatorpractice.databinding.FragmentEntryBinding



private lateinit var binding: FragmentEntryBinding
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

open class EntryFragment : Fragment() {


    //private lateinit var viewModel:       //ViewModel from Week 11.
        //reset the whole app to use viewmodel.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEntryBinding.inflate(inflater, container, false)
        return binding.root
    }

    //will be changed by activity when called.
    fun changeEntry(text: String){
        binding.tvEntry.text = text
    }
}