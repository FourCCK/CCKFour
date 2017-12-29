package com.cck.FourTeam_Kotlin.gyz.model

import com.cck.FourTeam_Kotlin.apiserver.ApiServer
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Flowable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by GUO on 2017/12/29.
 */
class SousuoModel {
    fun getSousuo(num:Int,query:String,start:Int): Flowable<HotBean> {
        val retrofit = Retrofit.Builder().baseUrl(ApiServer.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        //通过反射动态代理拿到apiserce
        val apiServer = retrofit.create(ApiServer::class.java)
        val flowable = apiServer.getSOusuo(10, query, start)
        return flowable
     }
}