package com.yijian2033.mdemo.mode;

/**
 * @author zhangyj
 * @version [Mdemo, 2018-04-20]
 */
public class LoginMode implements Mode {
    @Override
    public String getData() {
        return "这是自己假造的登录数据";
    }

    @Override
    public void login(final String username, final String password, final LoginListener listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);

                    if ("john".equals(username) && "123".equals(password)) {
                        User user = new User(username, password);
                        listener.onSuccess(user);
                    } else {
                        listener.onFailed();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
