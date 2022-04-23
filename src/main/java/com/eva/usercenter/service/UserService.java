package com.eva.usercenter.service;

import com.eva.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *用户服务
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}
