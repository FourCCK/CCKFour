package com.cck.FourTeam_Kotlin.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.cck.FourTeam_Kotlin.R


/**
 * Created by C-PC on 2017/12/21.
 */

class Fragment01 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater!!.inflate(R.layout.fragment01, null)
    }
}
