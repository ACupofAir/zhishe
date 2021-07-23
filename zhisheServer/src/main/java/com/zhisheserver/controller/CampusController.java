package com.zhisheserver.controller;


import com.zhisheserver.entity.Campus;
import com.zhisheserver.entity.College;
import com.zhisheserver.service.CampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-07-21
 */
@RestController
@RequestMapping("//campus")
public class CampusController {

    @Autowired
    public CampusService campusService;


    @GetMapping("/find/{name}")
    public Campus getByName(@PathVariable("name") String name){
        return this.campusService.getByName(name);
    }
}

