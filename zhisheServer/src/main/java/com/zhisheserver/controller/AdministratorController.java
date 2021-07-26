package com.zhisheserver.controller;


import com.zhisheserver.dto.Login;
import com.zhisheserver.entity.Administrator;
import com.zhisheserver.mapper.AdministratorMapper;
import com.zhisheserver.result.LoginResult;
import com.zhisheserver.service.AdministratorService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
@Controller
@RequestMapping("//administrator")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @PostMapping("/login")
    @ResponseBody
    public Object login(
            @RequestBody Login login
    ){
        return administratorService.LoginUser(login);
    }
}

