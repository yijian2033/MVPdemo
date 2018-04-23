package com.yijian2033.mdemo.mode;

/**
 * @author zhangyj
 * @version [Mdemo, 2018-04-20]
 */
public interface Mode {

    String getData();

    void login(String usename, String password, LoginListener listener);

    interface LoginListener {

        //登录成功
        void onSuccess(User user);

        //登录失败
        void onFailed();

    }

}
