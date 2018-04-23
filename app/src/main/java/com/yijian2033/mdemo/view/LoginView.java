package com.yijian2033.mdemo.view;

import com.yijian2033.mdemo.mode.User;

/**
 * @author zhangyj
 * @version [Mdemo, 2018-04-20]
 */
public interface LoginView {

    void setData(String str);

    String getUsername();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
