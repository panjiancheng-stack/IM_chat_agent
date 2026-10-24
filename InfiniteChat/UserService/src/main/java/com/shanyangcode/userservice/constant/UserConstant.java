package com.shanyangcode.userservice.constant;


import java.util.concurrent.TimeUnit;

public class UserConstant {

    public static final String EMAIL_SUBJECT = "【验证码】";

    public static final String SEND_EMAIL_SUCCESS = "发送邮件成功";
    
    public static final Integer CAPTCHA_EXPIRE_TIME = 5;

    public static final String PASSWORD_SALT = "goat";

    public static final Integer WORKER_ID = 1;

    public static final Integer DATA_CENTER_ID = 1;

    // TODO: 替换为你自己的、至少32字节的 Base64 JWT 签名密钥（请勿提交真实密钥）
    public static final String TOKEN_SECRET_KEY = "replace-with-your-own-base64-jwt-secret-key-please-do-not-commit-real-key";

    public static final Integer ACCESS_TOKEN_EXPIRE_TIME =  30;

    public static final Integer REFRESH_TOKEN_EXPIRE_TIME =  7;

    public static final String ACCESS_TOKEN_PREFIX = "access:token:";

    public static final String REFRESH_TOKEN_PREFIX = "refresh:token:";

    public static final TimeUnit ACCESS_TOKEN_UNIT = TimeUnit.MINUTES; // 分钟

    public static final TimeUnit REFRESH_TOKEN_UNIT = TimeUnit.DAYS; // 天
}
