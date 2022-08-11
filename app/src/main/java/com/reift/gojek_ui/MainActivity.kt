package com.reift.gojek_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.reift.gojek_ui.adapter.ViewPagerAdapter
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
        binding.viewPager.adapter = ViewPagerAdapter(this)
        TabLayoutMediator(binding.tabBar, binding.viewPager) { tab, position ->
            tab.icon = when(position){
                0 -> getDrawable(R.drawable.ic_promo)
                1 -> getDrawable(R.drawable.ic_home)
                2 -> getDrawable(R.drawable.ic_chat)
                else -> getDrawable(R.drawable.ic_home)
            }
        }.attach()

    }
}