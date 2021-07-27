package com.zhisheserver.controller;


import com.zhisheserver.dto.Labels;
import com.zhisheserver.entity.Campus;
import com.zhisheserver.service.CampusService;
import com.zhisheserver.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
@RestController
@RequestMapping("//campus")
public class CampusController {
    @Autowired
    public CampusService campusService;

    @Autowired
    public CommentService commentService;

    @GetMapping("/find/{name}")
    public Campus getByName(@PathVariable("name") String name){
        return this.campusService.getByName(name);
    }

    @PostMapping("/scores")
    @ResponseBody
    public List<Double> scores(
            @RequestBody Labels la
    ){
        System.out.println("控制器");
        System.out.println(commentService.PartByLabels(la));
        return campusService.GetAllScores(commentService.PartByLabels(la));
    }
}

