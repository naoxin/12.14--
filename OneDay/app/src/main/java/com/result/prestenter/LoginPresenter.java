package com.result.prestenter;

import com.result.bean.ICallBack;
import com.result.bean.UserBean;
import com.result.model.ILoginBean;
import com.result.model.LoginBean;
import com.result.view.ILoginView;

/**
 * 1.作用
 * 2.作者：李延
 * 3.时间：2016、11、24
 */

public class LoginPresenter implements ILoginPresenter {
    private ILoginBean mILoginBean;
    private ILoginView mILoginView;

    public LoginPresenter(ILoginView mILoginView) {
        this.mILoginView = mILoginView;
        mILoginBean = new LoginBean();
    }

    @Override
    public void login(String name, String pwd) {
        if (name.trim().length() == 0) {
            mILoginView.loginFail("用户名不能为空！！！");
            return;
        }
        if (pwd.length() < 6) {
            mILoginView.loginFail("密码至少六位！！！");
            return;
        }
        mILoginBean.login(name, pwd, new ICallBack() {
            @Override
            public void succedt(UserBean user) {
                mILoginView.loginSuccess(user);
            }

            @Override
            public void fail(String ssmag) {
                mILoginView.loginFail(ssmag);
            }
        });
    }
}
