package com.work.web.controller;

import com.work.common.base.annotations.UserOperaterLog;
import com.work.common.base.enums.OperaterTypeEnum;
import com.work.common.base.enums.SystemEnum;
import com.work.common.base.model.Result;
import com.work.web.dto.UserReqDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * UserCcontroller
 *
 * @author wmy
 * @date 2023/4/10 10:20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @UserOperaterLog(open = true,chancal= SystemEnum.PC,operaterType = OperaterTypeEnum.SELECT,moduleName = "用户",respBody = true)
    @GetMapping("/getImgCode")
    public Result<String> getImgCode(){
        return new Result<String>("123");
    }

    @UserOperaterLog(chancal= SystemEnum.PC,operaterType = OperaterTypeEnum.SELECT,moduleName = "用户")
    @PostMapping("/login")
    public void login(@RequestBody UserReqDTO userReqDTO, HttpServletRequest request, HttpServletResponse response){
        System.out.println(userReqDTO.toString());
    }
}
