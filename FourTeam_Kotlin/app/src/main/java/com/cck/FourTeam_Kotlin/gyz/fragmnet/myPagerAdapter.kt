package com.cck.FourTeam_Kotlin.gyz.fragmnet

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

import com.example.kotlinmvp.Fragment1
import com.example.kotlinmvp.Fragment2
import com.example.kotlinmvp.Fragment3

/**
 * Created by GUO on 2017/12/28.
 */

class myPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    internal var title = arrayOf("周排行", "月排行", "总排行")
    internal var fragment1: Fragment1? = null
    internal var fragment2: Fragment2? = null
    internal var fragment3: Fragment3? = null

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> {
                fragment1 = Fragment1()
                return fragment1
            }
            1 -> {
                fragment2 = Fragment2()
                return fragment2
            }
            2 -> {
                fragment3 = Fragment3()
                return fragment3
            }

            else -> return null
        }
    }

    override fun getCount(): Int {

        return title.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return title[position]
    }

}

