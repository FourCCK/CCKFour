package com.cck.FourTeam_Kotlin.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.astuetz.PagerSlidingTabStrip
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.activity.SousuoActivity
import com.cck.FourTeam_Kotlin.gyz.fragmnet.myPagerAdapter
import com.example.kotlinmvp.Fragment1
import com.example.kotlinmvp.Fragment2
import com.example.kotlinmvp.Fragment3


/**
 * Created by C-PC on 2017/12/21.
 */

class Fragment03 : Fragment() {
    var pager: myPagerAdapter? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflate = inflater!!.inflate(R.layout.fragment03, container, false)
        val viewPager = inflate.findViewById<ViewPager>(R.id.viewPager) as ViewPager
        val imageView = inflate.findViewById<ImageView>(R.id.sousuo_iv) as ImageView
        val tabStrip = inflate.findViewById<PagerSlidingTabStrip>(R.id.tabs) as PagerSlidingTabStrip
        val fragments = ArrayList<Fragment>()
        val fragment1 = Fragment1()
        val fragment2 = Fragment2()
        val fragment3 = Fragment3()
        fragments.add(fragment1)
        fragments.add(fragment2)
        fragments.add(fragment3)
        pager = myPagerAdapter(this.fragmentManager)
        viewPager?.setAdapter(pager)
        tabStrip?.setViewPager(viewPager)
        imageView.setOnClickListener(object :View.OnClickListener{
              override fun onClick(v: View?) {
                  val intent = activity.intent.setClass(activity, SousuoActivity::class.java)
                  startActivity(intent)
              }

          })
        return inflate

    }
}
