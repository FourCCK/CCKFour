package com.cck.FourTeam_Kotlin.gyz.adapter

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import com.facebook.drawee.view.SimpleDraweeView

/**
 * Created by GUO on 2017/12/28.
 */
class HotWeeklyAdapter(context: Context, list: List<HotBean.ItemListBean>?): RecyclerView.Adapter<HotWeeklyAdapter.MyviewHodler>() {
      val context:Context=context
    val list:ArrayList<HotBean.ItemListBean>? = list as ArrayList<HotBean.ItemListBean>?
    override fun onBindViewHolder(holder: MyviewHodler?, position: Int) {
        val listBean = list?.get(position)

        val parse = Uri.parse(listBean?.data?.cover?.feed)

        holder?.sdv?.setImageURI(parse)
        holder?.tltie?.setText(listBean?.data?.title)
       // holder?.time?.setText(listBean?.data?.cover?.)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyviewHodler {
        val inflate = LayoutInflater.from(context).inflate(R.layout.hotitem, parent, false)
         return MyviewHodler(inflate)
    }

    override fun getItemCount(): Int {
       return list?.size!!
    }

    class MyviewHodler(itemView: View?) : RecyclerView.ViewHolder(itemView) {
           var sdv: SimpleDraweeView =itemView?.findViewById<SimpleDraweeView>(R.id.hot_sdv) as SimpleDraweeView
           var tltie:TextView=itemView?.findViewById<TextView>(R.id.tv_title)as TextView
        var time:TextView=itemView?.findViewById<TextView>(R.id.tv_time)as TextView
    }
}