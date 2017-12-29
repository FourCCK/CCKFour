package com.cck.FourTeam_Kotlin.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.bwie.bean.findbean
import com.cck.FourTeam_Kotlin.R
import com.cck.FourTeam_Kotlin.activity.FindxpActivity
import com.squareup.picasso.Picasso


/**
 * Created by C-PC on 2017/12/27.
 */
class FindAdapter(mCtx:Context,list: List<findbean>):RecyclerView.Adapter<FindAdapter.MHolder>(){
    private var context:Context=mCtx
    private var list:List<findbean> = list



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MHolder {
        return MHolder(LayoutInflater.from(context).inflate(R.layout.fragment02_rv_item,parent,false))

    }

    override fun onBindViewHolder(holder: MHolder?, position: Int) {
        holder!!.tv!!.setText(list.get(position).name);
        Picasso.with(context).load(list.get(position).bgPicture).into(holder!!.iv);
        //Log.i("TAG",list.get(position).description+"111")
        holder?.buji?.setOnClickListener({
            var inten= Intent(context, FindxpActivity::class.java)
            inten.putExtra("findname",list.get(position).name)
            context.startActivity(inten)
        })
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    class MHolder(itemView:View?): RecyclerView.ViewHolder(itemView){
        var iv =itemView!!.findViewById<ImageView>(R.id.iv) as ImageView;
        var tv =itemView!!.findViewById<TextView>(R.id.tv_name) as TextView;
        var buji: RelativeLayout =itemView!!.findViewById(R.id.findr)
    }
}