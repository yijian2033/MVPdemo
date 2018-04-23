package com.yijian2033.mdemo.mode;

/**
 * @author zhangyj
 * @version [Mdemo, 2018-04-20]
 */
public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
