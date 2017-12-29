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
<<<<<<< HEAD
=======

>>>>>>> 7c803e8c8ea3272c4e209b0edc42c4dc2acbe26f
    fun getData(@Query("udid")udid:String, @Query("vc") vc:Int): Flowable<List<findbean>>
    //首页数据
    //获取首页第一页数据
    //?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83
    @GET("feed")
    fun getHomeData(@Query("num")num :Int , @Query("udid")udid : String, @Query("vc")vc:Int):Flowable<HomeBean>

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

    fun getData(@Query("udid")udid:String,@Query("vc") vc:Int):Flowable<List<findbean>>
>>>>>>> 6b7c121f96aea611d8e42daee30302e888be5464
>>>>>>> 7c803e8c8ea3272c4e209b0edc42c4dc2acbe26f

    @GET("v3/ranklist")
    fun getHot(@Query("num") num:Int, @Query("strategy") strategy:String,@Query("udid")udid:String, @Query("vc") vc:Int):Flowable<HotBean>


}
