package com.cck.FourTeam_Kotlin.fragment

import android.util.Log
import com.bwie.bean.findbean
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.base.BaseFragment
import com.cck.FourTeam_Kotlin.cck.presenter.GoodsPresenter
import com.cck.FourTeam_Kotlin.cck.view.GoodsView


/**
 * Created by C-PC on 2017/12/21.
 */

class Fragment02 : BaseFragment<GoodsPresenter>(),GoodsView {


    override fun layoutId(): Int =R.layout.fragment02

    override fun initView() {

    }

    override fun getPresenter(): GoodsPresenter {
        return GoodsPresenter(this)
    }

    override fun initData() {
        presenter!!.pm()
    }


    //重写view的方法
    override fun showData(findbean: List<findbean>) {
        Log.i("xxx",findbean?.get(0).name)
    }

}
