package com.result.model;

import android.util.Log;

import com.result.bean.ICallBack;
import com.result.bean.UserBean;

import static android.content.ContentValues.TAG;

/**
 * 1.作用
 * 2.作者：李延
 * 3.时间：2016、11、24
 */

public class LoginBean implements ILoginBean{
    @Override
    public void login(String name, String pwd, ICallBack callBack) {

        try {
            Log.e(TAG, "login: "+"网络请求当中.........");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ("liyan".equals(name)&&"521624".equals(pwd)){
            callBack.succedt(new UserBean());
        }else {
            callBack.fail("用户名或密码错误请重新输入！！！");
        }
    }
}
