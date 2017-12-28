package com.example.kotlinmvp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.VideoActivity
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
        //初始化p
        val hotPresenter = HotPresenter(this)
        //v与P关联
        hotPresenter!!.relevance("monthly")
        return inflate
    }
    //实现接口
    override fun showHot(hotBean: HotBean) {
        //recyclerview初始化
        hot_rv?.layoutManager= LinearLayoutManager(this!!.activity)
        val itemList = hotBean.itemList
        //适配器
        val adapter= HotWeeklyAdapter(activity,itemList)
        //关联
        hot_rv.adapter=adapter
        //点击事件
           adapter.setOnclicklistener(object :HotWeeklyAdapter.Onclicklistener{
               override fun Onclick(listbean: HotBean.ItemListBean) {
                  // val title = listbean?.data?.title
                 //  Toast.makeText(activity, title, Toast.LENGTH_LONG).show()
                   //跳转activity
                   activity.intent.setClass(activity,VideoActivity::class.java)
                   //传值
                   activity.intent.putExtra("url",listbean?.data?.playUrl)
                   activity.intent.putExtra("title",listbean?.data?.title)
                   activity.intent.putExtra("description",listbean?.data?.description)
                   startActivity(activity.intent)
               }

           })
    }
}