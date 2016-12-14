package com.result.model;

import com.result.bean.ICallBack;

/**
 * 1.作用
 * 2.作者：李延
 * 3.时间：2016、11、24
 */

public interface ILoginBean {
    void login(String name, String pwd, ICallBack callBack);
}
