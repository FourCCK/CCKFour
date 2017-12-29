package com.cck.FourTeam_Kotlin.gyz.presenter

import com.cck.FourTeam_Kotlin.gyz.model.SousuoModel
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import com.cck.FourTeam_Kotlin.gyz.view.HotView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by GUO on 2017/12/29.
 */
class SousuoPresenter(hotView: HotView) {
 val sousuomodel:SousuoModel= SousuoModel()
    val hotview:HotView=hotView
    fun relevance(num:Int,query:String,start:Int){
        //被观察者与订阅者默认在同一个线程
        val flowable = sousuomodel.getSousuo(10, query, start)
        flowable.subscribeOn(Schedulers.io())//子线程耗时操作
                .observeOn(AndroidSchedulers.mainThread())//主线程更新
                .subscribeWith(object : DisposableSubscriber<HotBean>() {
                    override fun onNext(t: HotBean?) {
                        hotview.showHot(t!!)
                    }

                    override fun onError(t: Throwable?) {

                    }

                    override fun onComplete() {

                    }

                })
    }
}