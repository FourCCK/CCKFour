package com.cck.FourTeam_Kotlin.csh

import com.cck.FourTeam_Kotlin.api.Api
import com.cck.FourTeam_Kotlin.apiserver.ApiServer
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Flowable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by 曹少航 on 2017/12/28.
 */
class HomeModel {
    fun getServiceData(): Flowable<List<HomeBean>> {
        val retrofit =Retrofit.Builder().baseUrl(Api.FINDURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        var apiService =retrofit.create(ApiServer::class.java)

        var flowable =apiService.getHomeData(2,"26868b32e808498db32fd51fb422d00175e179df",83)

        return flowable
    }

}