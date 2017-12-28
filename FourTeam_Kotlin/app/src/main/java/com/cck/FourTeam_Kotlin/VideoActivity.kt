package com.cck.FourTeam_Kotlin

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_video.*
import tv.danmaku.ijk.media.widget.media.AndroidMediaController
import tv.danmaku.ijk.media.widget.media.IjkVideoView

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
       val ijk=findViewById(R.id.ijk) as IjkVideoView
        //intent传值
        val stringExtra = intent.getStringExtra("url")
        val tltie = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")
        //视频播放
        val androidMediaController = AndroidMediaController(this, false)
        ijk.setMediaController(androidMediaController)
        //播放路径
        ijk.setVideoURI(Uri.parse(stringExtra))
        ijk.start()
        tv_video_title.setText(tltie)
        tv_video_desc.setText(description)
    }
}
