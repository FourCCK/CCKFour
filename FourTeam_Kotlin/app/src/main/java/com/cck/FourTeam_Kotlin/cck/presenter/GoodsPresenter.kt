package com.cck.FourTeam_Kotlin.cck.presenter

import com.bwie.bean.findbean
import com.cck.FourTeam_Kotlin.cck.model.GoodsModel
import com.cck.FourTeam_Kotlin.cck.view.GoodsView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by C-PC on 2017/12/27.
 */
class GoodsPresenter(goodsView: GoodsView){
    val model:GoodsModel?= GoodsModel()

    val goodsView:GoodsView?=goodsView

    //让P跟M关联
    fun pm(){
        val flowable = model!!.getServerData()
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<ArrayList<findbean>>() {
                    override fun onComplete() {

                    }

                    override fun onError(t: Throwable?) {

                    }

                    override fun onNext(t: ArrayList<findbean>?) {
                        //把数据给view
                        goodsView!!.showData(t!!)
                    }

                })
    }
}