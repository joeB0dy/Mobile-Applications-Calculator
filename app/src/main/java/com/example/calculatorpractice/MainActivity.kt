package com.example.calculatorpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var whichFragment = 1 //important for switching fragments.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
    }
}