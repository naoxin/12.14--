package com.result.view;

import com.result.bean.UserBean;

/**
 * 1.作用
 * 2.作者：李延
 * 3.时间：2016、11、24
 */

public interface ILoginView {
    void loginSuccess(UserBean user);
    void loginFail(String errmag);
}
