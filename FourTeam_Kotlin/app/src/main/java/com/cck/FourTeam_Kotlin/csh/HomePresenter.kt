package com.cck.FourTeam_Kotlin.csh

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by 曹少航 on 2017/12/28.
 */
class HomePresenter(homeView: HomeView) {
    val  model:HomeModel?= HomeModel()
    val homeView:HomeView?=homeView
    //p跟m关联
     fun pm(){
        val flowable = model!!.getServiceData()
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<HomeBean>(){
                    override fun onError(t: Throwable?) {

                    }
                    override fun onComplete() {

                    }

                    override fun onNext(t: HomeBean?) {
                        //把数据给view
                        homeView!!.showData(t!!)
                    }

                })

     }

}