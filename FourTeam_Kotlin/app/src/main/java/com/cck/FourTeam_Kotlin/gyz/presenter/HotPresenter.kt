package com.cck.FourTeam_Kotlin.gyz.presenter

import com.cck.FourTeam_Kotlin.gyz.model.HotModel
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import com.cck.FourTeam_Kotlin.gyz.view.HotView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by GUO on 2017/12/27.
 */
class HotPresenter(hotview: HotView) {
    val model:HotModel?= HotModel()
    val hotview:HotView?=hotview
    fun relevance(strategy:String){
        val flowable = model!!.getHotModel(strategy)
        flowable?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribeWith(object : DisposableSubscriber <HotBean>(){
                    override fun onNext(t: HotBean?) {
                        hotview?.showHot(t!!)
                    }

                    override fun onError(t: Throwable?) {

                    }

                    override fun onComplete() {

                    }

                })
    }
}