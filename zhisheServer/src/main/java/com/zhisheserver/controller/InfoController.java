package com.zhisheserver.controller;


import com.zhisheserver.entity.Info;
import com.zhisheserver.mapper.InfoMapper;
import com.zhisheserver.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@RestController
@RequestMapping("//info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/datas")
    public Info getInfo()
    {
        return infoService.getAllInfo();
    }
    
}

