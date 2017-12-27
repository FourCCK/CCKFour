package com.cck.FourTeam_Kotlin

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cck.FourTeam_Kotlin.fragment.Fragment01
import com.cck.FourTeam_Kotlin.fragment.Fragment02
import com.cck.FourTeam_Kotlin.fragment.Fragment03
import com.cck.FourTeam_Kotlin.fragment.Fragment04
import com.hjm.bottomtabbar.BottomTabBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btb.init(supportFragmentManager)
                .setImgSize(50f, 50f)
                .setFontSize(14f)
                .setTabPadding(4f, 6f, 10f)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("首页", R.drawable.tab_02, Fragment01::class.java)
                .addTabItem("发现", R.drawable.tab_03, Fragment02::class.java)
                .addTabItem("热门", R.drawable.tab_01, Fragment03::class.java)
                .addTabItem("我的", R.drawable.tab_04, Fragment04::class.java)
                .isShowDivider(false)
                .setOnTabChangeListener(BottomTabBar.OnTabChangeListener { position, name -> })

    }
}