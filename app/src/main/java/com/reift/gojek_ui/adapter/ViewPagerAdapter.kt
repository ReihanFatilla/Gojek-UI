package com.reift.gojek_ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.reift.gojek_ui.presentation.chat.ChatFragment
import com.reift.gojek_ui.presentation.home.HomeFragment
import com.reift.gojek_ui.presentation.promo.PromoFragment

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> PromoFragment()
            1 -> HomeFragment()
            2 -> ChatFragment()
            else -> HomeFragment()
        }
    }


}