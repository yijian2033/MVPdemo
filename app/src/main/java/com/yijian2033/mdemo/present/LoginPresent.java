package com.yijian2033.mdemo.present;

import android.os.Handler;

import com.yijian2033.mdemo.mode.LoginMode;
import com.yijian2033.mdemo.mode.Mode;
import com.yijian2033.mdemo.mode.User;
import com.yijian2033.mdemo.view.LoginView;

/**
 * @author zhangyj
 * @version [Mdemo, 2018-04-20]
 */
public class LoginPresent implements Present {

    private LoginView view;
    private LoginMode mode;
    private Handler mHandler = new Handler();

    public LoginPresent(LoginView view) {
        this.view = view;
        mode = new LoginMode();
    }

    @Override
    public void loadData(int i) {
        String data = mode.getData();
        view.setData(data + i);
    }

    @Override
    public void login() {

        String username = view.getUsername();
        String password = view.getPassword();

        mode.login(username, password, new Mode.LoginListener() {
            @Override
            public void onSuccess(final User user) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.toMainActivity(user);
                        view.hideLoading();
                    }
                });

            }

            @Override
            public void onFailed() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.hideLoading();
                        view.showFailedError();
                    }
                });

            }
        });
    }

    @Override
    public void clear() {
        view.clearUserName();
        view.clearPassword();
    }
}
