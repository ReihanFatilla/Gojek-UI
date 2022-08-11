package com.reift.gojek_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reift.gojek_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpViewPager()

    }

    private fun setUpViewPager() {
    }
}