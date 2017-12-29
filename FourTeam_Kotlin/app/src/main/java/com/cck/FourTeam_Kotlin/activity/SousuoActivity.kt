package com.cck.FourTeam_Kotlin.activity

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import com.cck.FourTeam_Kotlin.R
import kotlinx.android.synthetic.main.activity_sousuo.*

class SousuoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sousuo)
       // 第三种
        if (Build.VERSION.SDK_INT >= 21) {
            val decorView = window.decorView
            val option = (View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
            decorView.systemUiVisibility = option
            window.navigationBarColor = Color.TRANSPARENT
            window.statusBarColor = Color.TRANSPARENT
        }
        val actionBar = supportActionBar
        actionBar!!.hide()
        val editText = findViewById(R.id.sousuo_et) as EditText
        sousuo_tv.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                val String1 = editText.text.toString().trim()
                val intent = intent.setClass(this@SousuoActivity, SouuoRecyclerviewActivity::class.java)
                intent.putExtra("query",String1)
                startActivity(intent)
            }

        })

    }


}
