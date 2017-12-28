package com.cck.FourTeam_Kotlin.whl;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cck.FourTeam_Kotlin.R;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HeadActivity extends AppCompatActivity implements View.OnClickListener{


    //调用系统相册-选择图片
    private static final int IMAGE = 1;
    /**
     * 点击选择图片上传
     */
    private Button mShangchan;
    /**
     * 跳转
     */
    private Button mTiao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);
        initView();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        //获取图片路径
        if (requestCode == IMAGE && resultCode == Activity.RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            String[] filePathColumns = {MediaStore.Images.Media.DATA};
            Cursor c = getContentResolver().query(selectedImage, filePathColumns, null, null, null);
            c.moveToFirst();
            int columnIndex = c.getColumnIndex(filePathColumns[0]);
            String imagePath = c.getString(columnIndex);




            ApiService apiService = RetrofitUtils.getInstance().getApiService("https://www.zhaoapi.cn/", ApiService.class);


            c.close();


            File file = new File(imagePath);

            RequestBody requestBody = RequestBody.create(MediaType.parse("application/otcet-stream"), file);
            MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestBody);
            RequestBody uid = requestBody.create(MediaType.parse("multipart/form-data"), "552");


//            RequestBody token = requestBody.create(MediaType.parse("multipart/form-data"), "4B5DAF274221936555E01E5F7BC271F4");

            Call<ResultBean> call = apiService.uploadPic(uid, body);

            call.enqueue(new Callback<ResultBean>() {
                @Override
                public void onResponse(Call<ResultBean> call, Response<ResultBean> response) {
                    ResultBean resultBean = response.body();
                    Log.e("xxx", resultBean.getMsg());
                }

                @Override
                public void onFailure(Call<ResultBean> call, Throwable t) {
                    Log.e("xxx", "失败");
                }
            });
        }
    }

    private void initView() {
        mShangchan = (Button) findViewById(R.id.shangchan);
        mShangchan.setOnClickListener(this);
        mTiao = (Button) findViewById(R.id.tiao);
        mTiao.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.shangchan:
                //调用相册
                Intent intent = new Intent(Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, IMAGE);
                break;
            case R.id.tiao:
                Intent intent1 = new Intent(HeadActivity.this,OtherActivity.class);
                startActivity(intent1);
                break;
        }
    }

}
