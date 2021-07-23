package com.zhisheserver.controller;


<<<<<<< HEAD
import com.zhisheserver.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
=======
import com.zhisheserver.dto.Login;
import com.zhisheserver.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
>>>>>>> 048a851755f83d62347b87a885c653863ddb9bf4

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
<<<<<<< HEAD
    public AdministratorService administratorService;


=======
    private AdministratorService administratorService;

    @PostMapping("/login")
    @ResponseBody
    public Object login(
            @RequestBody Login login
    ){
        return administratorService.LoginUser(login);
    }
>>>>>>> 048a851755f83d62347b87a885c653863ddb9bf4
}

