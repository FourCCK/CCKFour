package com.example.kotlinmvp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cck.FourTeam_Kotlin.R

/**
 * Created by GUO on 2017/12/27.
 */
class Fragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflate = inflater?.inflate(R.layout.fragment1, container, false)
        return inflate
    }
}