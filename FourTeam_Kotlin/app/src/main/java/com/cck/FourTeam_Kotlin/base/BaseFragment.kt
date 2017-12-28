package com.cck.FourTeam_Kotlin.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cck.FourTeam_Kotlin.cck.presenter.GoodsPresenter


/**
 * Created by C-PC on 2017/12/21.
 */

abstract class BaseFragment<T: GoodsPresenter> : Fragment() {
    var presenter:T?=null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        initView();
        presenter=getPresenter()
        initData();
        return inflater!!.inflate(layoutId(), null)
    }

    //加载布局
    abstract fun layoutId():Int
    abstract fun initView()
    //内部
    internal abstract fun getPresenter():T
    abstract fun initData();
}
