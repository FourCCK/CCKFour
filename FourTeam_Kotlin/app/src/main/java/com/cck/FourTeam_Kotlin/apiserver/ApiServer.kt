package com.cck.FourTeam_Kotlin.apiserver

import com.bwie.bean.findbean
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by C-PC on 2017/12/27.
 */
interface ApiServer{
    @GET("categories")
    fun getData(@Query("udid")udid:String,@Query("vc") vc:Int):Flowable<List<findbean>>
}
