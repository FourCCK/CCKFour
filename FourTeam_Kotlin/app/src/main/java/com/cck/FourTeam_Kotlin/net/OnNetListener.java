package com.cck.FourTeam_Kotlin.net;


import com.cck.FourTeam_Kotlin.bean.BaseBean;

/**
 * Created by C-PC on 2017/10/19.
 */

public interface OnNetListener {
    public void onSuccess(BaseBean baseBean);

    public void onError();


}
