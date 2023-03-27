package com.example.calculatorpractice

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.calculatorpractice.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression


class MainActivity : FragmentActivity(), ButtonFragment.ButtonFragmentListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


    override fun onButtonClick(answerDisplay: String) {

        val entered =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as EntryFragment
        entered.changeEntry(answerDisplay)
    }
}
