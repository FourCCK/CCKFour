package com.cck.FourTeam_Kotlin.activity

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.gyz.adapter.SousuoRecyclerviewAdapter
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import com.cck.FourTeam_Kotlin.gyz.presenter.SousuoPresenter
import com.cck.FourTeam_Kotlin.gyz.view.HotView
import kotlinx.android.synthetic.main.activity_souuo_recyclerview.*

class SouuoRecyclerviewActivity : AppCompatActivity(),HotView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_souuo_recyclerview)
      //  第三种
        if (Build.VERSION.SDK_INT >= 21) {
            val decorView = window.decorView
            val option = (View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
            decorView.systemUiVisibility = option
            window.navigationBarColor = Color.TRANSPARENT
            window.statusBarColor = Color.TRANSPARENT
        }
        val actionBar = supportActionBar
        actionBar!!.hide()
        val stringExtra = intent.getStringExtra("query")
        back_tv.setText("'"+stringExtra+"'"+"相关")
        bacg_iv.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = intent.setClass(this@SouuoRecyclerviewActivity, SousuoActivity::class.java)
                startActivity(intent)
            }

        })
             val presenter=SousuoPresenter(this)
        presenter.relevance(10,stringExtra,30)
    }
    override fun showHot(hotBean: HotBean) {
        sousuo_rv.layoutManager=LinearLayoutManager(this)
        val itemList = hotBean.itemList
         var adapter=SousuoRecyclerviewAdapter(this, itemList as ArrayList<HotBean.ItemListBean>)
      sousuo_rv.adapter=adapter
    }

}
