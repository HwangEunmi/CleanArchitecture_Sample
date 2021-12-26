package com.kakaovx.practice.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kakaovx.practice.presentation.databinding.ActivityDetailBinding
import org.koin.android.ext.android.inject

class DetailActivity : AppCompatActivity() {
    private val viewModel: DetailViewModel by inject()
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
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