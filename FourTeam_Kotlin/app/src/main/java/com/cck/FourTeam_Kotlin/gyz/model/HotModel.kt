package com.cck.FourTeam_Kotlin.gyz.model

import com.cck.FourTeam_Kotlin.apiserver.ApiServer
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Flowable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by GUO on 2017/12/27.
 */
class HotModel {
    fun getHotModel(strategy: String?): Flowable<HotBean>? {
        val retrofit = Retrofit.Builder().baseUrl(ApiServer.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        val apiServer = retrofit.create(ApiServer::class.java)
     return apiServer?.getHot(10, strategy!!, "26868b32e808498db32fd51fb422d00175e179df", 83)
    }
}