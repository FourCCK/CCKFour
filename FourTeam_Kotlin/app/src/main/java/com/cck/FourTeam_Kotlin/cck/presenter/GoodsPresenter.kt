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
<<<<<<< HEAD
                .subscribeWith(object : DisposableSubscriber<List<findbean>>() {
=======
<<<<<<< HEAD
                .subscribeWith(object : DisposableSubscriber<List<findbean>>(){
=======
                .subscribeWith(object : DisposableSubscriber<List<findbean>>() {
>>>>>>> 6b7c121f96aea611d8e42daee30302e888be5464
>>>>>>> 7c803e8c8ea3272c4e209b0edc42c4dc2acbe26f
                    override fun onComplete() {

                    }

                    override fun onNext(t: List<findbean>?) {
                     goodsView?.showData((t as ArrayList<findbean>?)!!)
                    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
                    override fun onError(t: Throwable?) {
=======
>>>>>>> 7c803e8c8ea3272c4e209b0edc42c4dc2acbe26f
                    override fun onNext(t: List<findbean>?) {
                        //把数据给view
                        goodsView!!.showData(t!!)
                    }
>>>>>>> 6b7c121f96aea611d8e42daee30302e888be5464

                    }
                })
    }
}