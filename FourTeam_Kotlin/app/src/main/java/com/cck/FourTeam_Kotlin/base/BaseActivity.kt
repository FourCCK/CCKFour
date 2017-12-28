package com.cck.FourTeam_Kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity <T>: AppCompatActivity() {
    var presenter: T? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        initView();
        presenter = getPresenter()
        initData()
    }

    //加载布局
    abstract fun layoutId():Int
    //Id
    abstract fun initView()
    //实例化p
   internal abstract fun getPresenter(): T?
    //关联
    abstract fun initData()

}
