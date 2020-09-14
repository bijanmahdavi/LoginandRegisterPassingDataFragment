package com.example.swipeviewloginsystem

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> LoginFragment()
            else -> RegisterFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}