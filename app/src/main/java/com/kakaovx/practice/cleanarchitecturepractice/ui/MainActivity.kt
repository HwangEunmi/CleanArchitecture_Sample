package com.kakaovx.practice.cleanarchitecturepractice.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakaovx.practice.cleanarchitecturepractice.R
import com.kakaovx.practice.cleanarchitecturepractice.databinding.ActivityMainBinding
import com.kakaovx.practice.presentation.ui.DetailActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()
    }

    private fun setListener() {
        binding.btnMoveDetail.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}