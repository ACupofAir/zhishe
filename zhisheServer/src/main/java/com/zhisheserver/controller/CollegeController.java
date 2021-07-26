package com.zhisheserver.controller;


import com.zhisheserver.entity.College;
import com.zhisheserver.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-07-20
 */
@RestController
@RequestMapping("//college")
public class CollegeController {

    @Autowired
    public CollegeService collegeService;

    @GetMapping("/list")
    public List<College> list(){
        return this.collegeService.list();
    }

    @GetMapping("/find/{name}")
    public College getByName(@PathVariable("name") String name){
        return this.collegeService.getByName(name);
    }

}

