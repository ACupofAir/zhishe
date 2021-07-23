package com.zhisheserver.controller;

import com.zhisheserver.dto.Login;
import com.zhisheserver.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-07-20
 */
@RestController
@RequestMapping("//administrator")
@Controller
@CrossOrigin

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

