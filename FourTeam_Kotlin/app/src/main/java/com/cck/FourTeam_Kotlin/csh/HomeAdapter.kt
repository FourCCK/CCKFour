package com.cck.FourTeam_Kotlin.csh

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.activity.VideoActivity

/**
 * Created by 曹少航 on 2017/12/28.
 */
class HomeAdapter(context: Context, list:List<HomeBean.IssueListBean.ItemListBean>): RecyclerView.Adapter<HomeAdapter.MyViewHolder>()  {
    private var context:Context = context
    private var list: List<HomeBean.IssueListBean.ItemListBean> = list

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {


        var feed:String? = null
        var playUrl:String? = null
        var title:String? = null
        var category:String? = null
        var icon:String? = null
        var description:String? = null

        val bean = list?.get(position)
        var minute = bean?.data?.duration?.div(60)
        var second = bean?.data?.duration?.minus((minute?.times(60)) as Long )

        if(position>0){
            var bean = list.get(position)
            var minute = bean?.data?.duration?.div(60)


           feed = list.get(position).data?.cover?.feed
            icon = list.get(position).data?.author?.icon

            description=list.get(position).data?.description

            title=list.get(position).data?.title
            category = list.get(position).data?.category
            playUrl=list.get(position).data?.playUrl
            Log.e("TAG",playUrl)
        }else{
            feed = list.get(5).data?.cover?.feed
            icon = list.get(5).data?.author?.icon
            title=list.get(5).data?.title
            category = list.get(5).data?.category
            playUrl=list.get(5).data?.playUrl
            description=list.get(position).data?.description
        }
        holder?.home_feed?.setImageURI(Uri.parse(feed))
        holder?.home_title?.text=title
        holder?.home_category?.text="发布于 $category"
        holder?.home_icon?.setImageURI(Uri.parse(icon))

        holder?.home_feed?.setOnClickListener{
            litener?.onItemClick(position)

           var intent: Intent =Intent(context, VideoActivity::class.java)
            intent.putExtra("url",playUrl)
            intent.putExtra("title",title)
            intent.putExtra("description",description)
            context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
     return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        var view= LayoutInflater.from(context).inflate(R.layout.item_home,parent,false)
        return  MyViewHolder(view)
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        var home_feed=itemView!!.findViewById<ImageView>(R.id.iv_photo) as ImageView
        var home_icon=itemView!!.findViewById<ImageView>(R.id.iv_user) as ImageView
        var home_title=itemView!!.findViewById<TextView>(R.id.tv_title)as TextView
        var home_category=itemView!!.findViewById<TextView>(R.id.tv_detail)as TextView

    }
    interface OnItemClickLitener{
        fun onItemClick(position : Int)
    }
    var litener:OnItemClickLitener?=null
    fun setOniteClickListener(litener: OnItemClickLitener){
        this.litener=litener
    }
}