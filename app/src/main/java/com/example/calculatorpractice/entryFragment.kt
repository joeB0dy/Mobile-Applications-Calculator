package com.example.calculatorpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculatorpractice.databinding.FragmentEntryBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class entryFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //buttons to code:
        //binding.tvEntry.text we need ViewModel to manipulate.

        

    }
    //private lateinit var viewModel:       //ViewModel from Week 11. gawd damn we are 4 weeks away from end of class.

    private lateinit var binding: FragmentEntryBinding       //reset the whole app to use.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEntryBinding.inflate(inflater, container, false)
        return binding.root
    }


}