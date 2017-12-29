package com.cck.FourTeam_Kotlin.cck.model

import com.bwie.bean.findbean
import com.cck.FourTeam_Kotlin.api.Api
import com.cck.FourTeam_Kotlin.apiserver.ApiServer
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Flowable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by C-PC on 2017/12/27.
 */
<<<<<<< HEAD
class GoodsModel {

    //进行网络请求
    fun getServerData(): Flowable<List<findbean>> {
=======
class GoodsModel{

    //进行网络请求
<<<<<<< HEAD
    fun getServerData():Flowable<List<findbean>>{


=======
<<<<<<< HEAD
    fun getServerData():Flowable<ArrayList<findbean>>{
>>>>>>> 8feb7b00638babcd8d409115b4106a14a2eb3abb
>>>>>>> 6b7c121f96aea611d8e42daee30302e888be5464

        val retrofit = Retrofit.Builder().baseUrl(Api.FINDURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        val apiServer = retrofit.create(ApiServer::class.java)
        val flowable = apiServer.getData("26868b32e808498db32fd51fb422d00175e179df", 83)
        return flowable
    }
=======


        fun getServerData(): Flowable<ArrayList<findbean>> {

            val retrofit = Retrofit.Builder().baseUrl(Api.FINDURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            val apiServer = retrofit.create(ApiServer::class.java)
            val flowable = apiServer.getData("26868b32e808498db32fd51fb422d00175e179df", 83)
            return flowable;
        }

>>>>>>> 8456960e8e98ad3ef2996449772935e987b544d6
}