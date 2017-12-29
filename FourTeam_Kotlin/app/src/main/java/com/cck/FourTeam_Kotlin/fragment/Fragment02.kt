package com.cck.FourTeam_Kotlin.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bwie.bean.findbean
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.adapter.FindAdapter
import com.cck.FourTeam_Kotlin.cck.presenter.GoodsPresenter
import com.cck.FourTeam_Kotlin.cck.view.GoodsView


/**
 * Created by C-PC on 2017/12/21.
 */

class Fragment02 : Fragment(), GoodsView {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment02, container, false)

        var pre= GoodsPresenter(this)
        pre!!.pm()

        return view
    }
    //重写view的方法
    override fun showData(findbean: ArrayList<findbean>) {
        Log.i("xxx", findbean.get(0).name);
            var adapter=FindAdapter(activity, findbean as ArrayList<findbean>)
        var re=view!!.findViewById<RecyclerView>(R.id.rv) as RecyclerView;
        re!!.layoutManager= GridLayoutManager(activity,2) as RecyclerView.LayoutManager?
            re!!.adapter=adapter

    }


}
