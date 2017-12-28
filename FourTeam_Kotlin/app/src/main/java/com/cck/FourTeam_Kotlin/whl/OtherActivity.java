package com.cck.FourTeam_Kotlin.whl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.cck.FourTeam_Kotlin.R;
import com.squareup.picasso.Picasso;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import retrofit2.Retrofit;

public class OtherActivity extends AppCompatActivity {

    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        initView();
    }

    private void initView() {
        mIv = (ImageView) findViewById(R.id.iv);

        //https://www.zhaoapi.cn/user/getUserInfo
        Retrofit retrofit = RetrofitUtils.getRetrofit("https://www.zhaoapi.cn/");
        ApiService apiService = retrofit.create(ApiService.class);
        Flowable<UserBean> observable = apiService.getdd();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<UserBean>(){

                    @Override
                    public void onNext(UserBean userBean) {
                        Picasso.with(OtherActivity.this).load(userBean.getData().getIcon()).into(mIv);
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
