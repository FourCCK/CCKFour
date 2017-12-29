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
 * Created by GUO on 2017/12/29.
 */
class SousuoRecyclerviewAdapter(context:Context,list: ArrayList<HotBean.ItemListBean>): RecyclerView.Adapter<SousuoRecyclerviewAdapter.MyViewHodeler>() {
    val context:Context=context
    val list: ArrayList<HotBean.ItemListBean> = list
    override fun onBindViewHolder(holder: MyViewHodeler?, position: Int) {
        val listBean = list.get(position)
        val description = listBean?.data?.cover?.feed
        val uri = Uri.parse(description)
        holder?.sdv?.setImageURI(uri)
        holder?.title?.setText(listBean?.data?.title)
        holder?.category?.setText(listBean?.data?.category)
    }

    override fun getItemCount(): Int {
         return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHodeler {
        val view = LayoutInflater.from(context).inflate(R.layout.sousuorecyclerview, parent, false)
        return MyViewHodeler(view)
    }

    class  MyViewHodeler(itemView: View?) : RecyclerView.ViewHolder(itemView) {
                val sdv:SimpleDraweeView=itemView?.findViewById<SimpleDraweeView>(R.id.rv_sdv)as SimpleDraweeView
        val title:TextView=itemView?.findViewById<TextView>(R.id.rv_tltie)as TextView
        val category:TextView=itemView?.findViewById<TextView>(R.id.rv_category) as TextView
    }
}