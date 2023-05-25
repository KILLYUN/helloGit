package com.work.web.dto;

import lombok.Data;

/**
 * UserDTO
 * 登录请求体
 * @author wmy
 * @date 2023/4/14 14:22
 */
@Data
public class UserReqDTO{

    /**
     * 用户账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 验证码
     */
    private String checkCode;

}
