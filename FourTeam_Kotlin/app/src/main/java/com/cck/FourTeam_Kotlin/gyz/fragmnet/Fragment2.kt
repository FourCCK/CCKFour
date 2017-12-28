package com.example.kotlinmvp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.gyz.adapter.HotWeeklyAdapter
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import com.cck.FourTeam_Kotlin.gyz.presenter.HotPresenter
import com.cck.FourTeam_Kotlin.gyz.view.HotView
import kotlinx.android.synthetic.main.fragment1.*

/**
 * Created by GUO on 2017/12/27.
 */
class Fragment2: Fragment(), HotView {
    val hotPresenter: HotPresenter? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflate = inflater?.inflate(R.layout.fragment2, container, false)
        val hotPresenter = HotPresenter(this)
        hotPresenter!!.relevance("monthly")

        return inflate
    }
    override fun showHot(hotBean: HotBean) {
        hot_rv?.layoutManager= LinearLayoutManager(this!!.activity)
        val itemList = hotBean.itemList
        val adapter= HotWeeklyAdapter(activity,itemList)
        hot_rv.adapter=adapter
           adapter.setOnclicklistener(object :HotWeeklyAdapter.Onclicklistener{
               override fun Onclick(listbean: HotBean.ItemListBean) {
                   val title = listbean?.data?.title
                   Toast.makeText(activity, title, Toast.LENGTH_LONG).show()
               }

           })
    }
}