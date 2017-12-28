package com.cck.FourTeam_Kotlin.apiserver

import com.bwie.bean.findbean
import com.cck.FourTeam_Kotlin.gyz.model.hotbean.HotBean
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by C-PC on 2017/12/27.
 */
interface ApiServer{
    companion object {
        val BASE_URL:String="http://baobab.kaiyanapp.com/api/"
    }
    @GET("categories")
    fun getData(@Query("udid") udid: String, @Query("vc") vc:Int):Flowable<List<findbean>>
    @GET("v3/ranklist")
    fun getHot(@Query("num") num:Int, @Query("strategy") strategy:String,@Query("udid")udid:String, @Query("vc") vc:Int):Flowable<HotBean>
}
