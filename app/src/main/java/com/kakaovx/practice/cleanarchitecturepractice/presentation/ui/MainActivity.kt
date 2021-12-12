package com.kakaovx.practice.cleanarchitecturepractice.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kakaovx.practice.cleanarchitecturepractice.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by inject()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()
        initObserve()
    }

    private fun setListener() {
        binding.getRepoInfo.setOnClickListener {
            viewModel.getRepoInfo("octocat", "hello-world")
        }

        binding.getUserInfo.setOnClickListener {
            viewModel.getUserInfo("octocat")
        }

        binding.getUserList.setOnClickListener {
            viewModel.getUserList()
        }
    }

    private fun initObserve() {
        viewModel.repoInfoItem.observe(this) {
            binding.apiResult.text = it.toString()
        }

        viewModel.userInfoItem.observe(this) {
            binding.apiResult.text = it.toString()
        }

        viewModel.userItems.observe(this) {
            binding.apiResult.text = it.toString()
        }
    }
}