package com.cck.FourTeam_Kotlin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.cck.FourTeam_Kotlin.R;
import com.cck.FourTeam_Kotlin.adapter.Find2Adapter;
import com.cck.FourTeam_Kotlin.bean.BaseBean;
import com.cck.FourTeam_Kotlin.bean.find2Bean;
import com.cck.FourTeam_Kotlin.net.HttpUtils;
import com.cck.FourTeam_Kotlin.net.OnNetListener;

import java.util.HashMap;
import java.util.List;

public class FindxpActivity extends AppCompatActivity {
    HashMap<String, String> map = new HashMap<>();
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findxp);
        rv = (RecyclerView) findViewById(R.id.rv);
        Intent intent = getIntent();
        String findname = intent.getStringExtra("findname");
        Toast.makeText(this,findname,Toast.LENGTH_LONG).show();
        http://baobab.kaiyanapp.com/api/v3/videos?categoryName=%E6%97%B6%E5%B0%9A&strategy=%s&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83
        map.put("categoryName",findname);
        map.put("strategy","");
        map.put("udid","26868b32e808498db32fd51fb422d00175e179df");
        map.put("vc","83");
        HttpUtils.getInstance().doPost("http://baobab.kaiyanapp.com/api/v3/videos?", map, find2Bean.class, new OnNetListener() {
            @Override
            public void onSuccess(BaseBean baseBean) {
                find2Bean find2Bean= (com.cck.FourTeam_Kotlin.bean.find2Bean) baseBean;
                String title = find2Bean.getItemList().get(0).getData().getTitle();
                Log.i("xxx","count--"+title);
                List<com.cck.FourTeam_Kotlin.bean.find2Bean.ItemListBean> list = find2Bean.getItemList();
                rv.setLayoutManager(new LinearLayoutManager(FindxpActivity.this, LinearLayoutManager.VERTICAL, false));
                Find2Adapter adapter = new Find2Adapter(FindxpActivity.this,list);
                rv.setAdapter(adapter);
            }

            @Override
            public void onError() {

            }
        });

    }
}
