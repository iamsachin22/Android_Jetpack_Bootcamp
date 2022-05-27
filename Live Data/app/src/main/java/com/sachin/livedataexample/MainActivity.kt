package com.sachin.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sachin.livedataexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel= ViewModelProvider(this)[MainActivityViewModel::class.java]
        viewModel.counterData.observe(this, Observer {
            binding.counterTextView.text = it.toString()
        })
        binding.submitButton.setOnClickListener {
            binding.counterTextView.text = viewModel.setUpdatedCount().toString()
        }
    }
}