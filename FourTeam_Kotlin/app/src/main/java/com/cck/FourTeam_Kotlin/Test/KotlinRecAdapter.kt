package com.cck.FourTeam_Kotlin.Test

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.cck.FourTeam_Kotlin.R

/**
 * Created by C-PC on 2017/12/26.
 */

class KotlinRecAdapter(mCtx:Context,mList:ArrayList<String>) :RecyclerView.Adapter<KotlinRecAdapter.MHolder>(){
    //可以把数据直接放到类名后面，然后用变量接收
    private var context:Context = mCtx
    private var list:ArrayList<String> = mList

    override fun onBindViewHolder(holder: MHolder?, position: Int) {
        // holder?.txtName?  都必须加个？号才可以调用  ?表示可以为空
        holder?.txtName?.text=list.get(position)
        holder?.linearlayout?.setOnClickListener {
            litener?.onItemClick(position)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MHolder {
        return MHolder(LayoutInflater.from(context).inflate(R.layout.kotlin_item, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }
    /**
     * 第一种写法
     * 使用快捷键的话默认使用的是第一种
     * ?表示可以为空
     * !! 第三个选择是 NPE-lovers。我们可以用 b!! ，这会返回一个非空的 b 或者抛出一个 b 为空的 NPE
     * */
    class MHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        //这里需要从前面一个一个写  直接写itemView.调用是不行的
        var txtName: TextView = itemView!!.findViewById(R.id.text_kotlin) as TextView
        var linearlayout: LinearLayout = itemView!!.findViewById(R.id.linearlayout) as LinearLayout
    }
    /**
     * 第二种写法
     * */
//class MHolder: RecyclerView.ViewHolder {
//    constructor(view : View) : super(view){
//
//    }
//    }

    /**
     * 自定义接口处理点击事件
     * 跟java的写法基本一致
     * */
    interface OnItemClickLitener {
        fun onItemClick(position : Int)
    }
    var litener: OnItemClickLitener? =null
    fun setOniteClickListener(litener : OnItemClickLitener){
        this.litener=litener
    }
}