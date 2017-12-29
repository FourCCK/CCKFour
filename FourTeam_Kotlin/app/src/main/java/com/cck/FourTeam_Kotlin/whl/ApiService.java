package com.cck.FourTeam_Kotlin.whl;

import io.reactivex.Flowable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by 朝朝暮暮 on 2017/12/1.
 */

public interface ApiService {

    //上传头像
    //https://www.zhaoapi.cn/file/upload

    @Multipart
    @POST("file/upload")
    Call<ResultBean> uploadPic(@Part("uid") RequestBody uid, @Part MultipartBody.Part file);

    @GET("user/getUserInfo?uid=1633&token=F309BCC258F0D7ECB396600350AC74A3")
    Flowable<UserBean> getdd();
}
