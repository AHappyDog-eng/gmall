package com.atguigu.gmall.user.entiy;

public class WxToken {
    private String token;
    private long expireTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public WxToken() {
    }

    public WxToken(String token, String expires_in) {
        this.token = token;
        /*计算过期时间 并复制 储存*/
        this.expireTime = Integer.parseInt(expires_in)*1000+System.currentTimeMillis();
    }
    /*
    * 判断token是否过期
    * \*/
    public  boolean IsPiredTime(){
        return System.currentTimeMillis()>expireTime;
    }
}
