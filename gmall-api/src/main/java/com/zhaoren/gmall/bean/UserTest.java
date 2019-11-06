package com.zhaoren.gmall.bean;

import java.io.Serializable;

/*如果想序列化json 数据就要继承 io的序列化接口*/
public class UserTest implements Serializable {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "UserTest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTest() {
    }

    public UserTest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
