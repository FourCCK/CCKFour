package com.cck.FourTeam_Kotlin.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.csh.HomeAdapter
import com.cck.FourTeam_Kotlin.csh.HomeBean
import com.cck.FourTeam_Kotlin.csh.HomePresenter
import com.cck.FourTeam_Kotlin.csh.HomeView
import kotlinx.android.synthetic.main.fragment01.*

/**
 * Created by C-PC on 2017/12/21.
 */

class Fragment01: Fragment(),HomeView {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment01, container, false)
       var  recycler1=view.findViewById(R.id.recycler1) as RecyclerView
        val linearLayoutManager = LinearLayoutManager(activity)
        recycler1.setLayoutManager(linearLayoutManager)
        var presenter=HomePresenter(this)
        presenter!!.pm()
        //recycler1.layoutManager= LinearLayoutManager(activity)

        return view
    }
    override fun showData(homeInfo: HomeBean) {

        val itemList=homeInfo.issueList!!.get(1).itemList!!

        Log.e("xx",itemList.get(1).data?.title)
        val homeAdpterr = HomeAdapter(activity, itemList)
        recycler1.adapter=homeAdpterr

    }
}
