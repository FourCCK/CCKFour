package com.example.kotlinmvp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.activity.VideoActivity
import com.cck.FourTeam_Kotlin.gyz.adapter.HotWeeklyAdapter
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import com.cck.FourTeam_Kotlin.gyz.presenter.HotPresenter
import com.cck.FourTeam_Kotlin.gyz.view.HotView
import kotlinx.android.synthetic.main.fragment1.*

/**
 * Created by GUO on 2017/12/27.
 */
class Fragment1 : Fragment(),HotView {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflate = inflater?.inflate(R.layout.fragment1, container, false)
        //初始化P
        val hotPresenter = HotPresenter(this)
        //P与v   关联
        hotPresenter!!.relevance("weekly")

        return inflate
    }
    override fun showHot(hotBean: HotBean) {
        //recyclerview初始化
        hot_rv?.layoutManager=LinearLayoutManager(this!!.activity)

        val itemList = hotBean.itemList
        //适配器
             val adapter=HotWeeklyAdapter(activity,itemList)
        hot_rv.adapter=adapter
        //点击事件
    adapter.setOnclicklistener(object :HotWeeklyAdapter.Onclicklistener{
        override fun Onclick(listbean: HotBean.ItemListBean) {
        //    val title = listbean?.data?.title
        // Toast.makeText(activity, title, Toast.LENGTH_LONG).show()
            //跳转传值
                 activity.intent.setClass(activity, VideoActivity::class.java)
            activity.intent.putExtra("url",listbean?.data?.playUrl)
            activity.intent.putExtra("title",listbean?.data?.title)
            activity.intent.putExtra("description",listbean?.data?.description)
            Toast.makeText(activity, listbean?.data?.playUrl, Toast.LENGTH_LONG).show()
            startActivity(activity.intent)
        }
    })
    }
}