package com.zhisheserver.controller;


import com.zhisheserver.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
public class AdministratorController {

    @Autowired
    public AdministratorService administratorService;


}

