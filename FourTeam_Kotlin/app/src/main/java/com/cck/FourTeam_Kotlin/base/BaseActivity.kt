package com.cck.FourTeam_Kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity <T>: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        initView();

    }
    //加载布局
    abstract fun layoutId():Int
    abstract fun initView():T



}
