package com.byh.administrator.tianqi.util;

/**
 * Created by Administrator on 2017/4/26.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
