package com.cck.FourTeam_Kotlin.apiserver


import com.bwie.bean.findbean
import com.cck.FourTeam_Kotlin.csh.HomeBean
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

    fun getData(@Query("udid")udid:String, @Query("vc") vc:Int): Flowable<ArrayList<findbean>>
    //首页数据
    //获取首页第一页数据
    //?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83
    @GET("feed")
    fun getHomeData(@Query("num")num :Int , @Query("udid")udid : String, @Query("vc")vc:Int):Flowable<HomeBean>



    @GET("v3/ranklist")
    fun getHot(@Query("num") num:Int, @Query("strategy") strategy:String,@Query("udid")udid:String, @Query("vc") vc:Int):Flowable<HotBean>

    @GET("v1/search")
    fun getSOusuo(@Query("num") num:Int, @Query("query") strategy:String, @Query("start") vc:Int):Flowable<HotBean>
}
