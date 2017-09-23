package com.loan.api.user;

import com.loan.common.Result;
import com.loan.entity.UserInfo;

/**
 *
 */
public interface UserService {

    /**
     * 用户注册
     * @param phone 电话号码
     * @param verifyCode 验证码
     * @param password 密码
     * @return
     */
    Result userRegister(String phone,String verifyCode,String password);

    /**
     * 发送验证码
     * @param phone 电话号码
     * @return
     */
    Result sendVerifyCode(String phone);

    /**
     * 上传用户信息
     * @param userInfo
     * @return
     */
    Result uploadPersonInfo(UserInfo userInfo);
}
