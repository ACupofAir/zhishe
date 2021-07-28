package com.zhisheserver.controller;


import com.zhisheserver.dto.CampusEdit;
import com.zhisheserver.dto.Labels;
import com.zhisheserver.entity.Campus;
import com.zhisheserver.entity.College;
import com.zhisheserver.mapper.CampusMapper;
import com.zhisheserver.service.CampusService;
import com.zhisheserver.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;
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

    @Autowired
    private CommentService commentService;

    @GetMapping("/list")
    public List<Campus> list(){
        return this.campusService.list();
    }

    @GetMapping("/find/{name}")
    public Campus getByName(@PathVariable("name") String name){
        return this.campusService.getByName(name);
    }

    @PostMapping("/post")
    @ResponseBody
    public Object saveCampus(
            @RequestBody Campus campus
    ){
        return campusService.saveCampus(campus);
    }


    @PostMapping("/scores")
    @ResponseBody
    public List<Double> scores(
            @RequestBody Labels la
    ){
        System.out.println("控制器");
        System.out.println(commentService.PartByLabels(la));
        return this.campusService.GetAllScores(commentService.PartByLabels(la));
    }

    @PostMapping("/updateCampus")
    @ResponseBody
    public Object updateCampus(
            @RequestBody CampusEdit campusEdit
    ){
        return this.campusService.updateCampus(campusEdit.getNewName(), campusEdit.getNewAdress(), campusEdit.getNewSchoolName(), campusEdit.getEditName());
    }
}

