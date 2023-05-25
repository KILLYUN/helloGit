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

    private String username;

    private String password;

    private String checkCode;

}
