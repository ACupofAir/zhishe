package com.zhisheserver.controller;


import com.zhisheserver.dto.Labels;
import com.zhisheserver.dto.Reg;
import com.zhisheserver.entity.Comment;
import com.zhisheserver.mapper.CommentMapper;
import com.zhisheserver.service.CommentService;
import org.apache.ibatis.annotations.Select;
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
@RequestMapping("//comment")
public class CommentController {

    @Autowired
    public CommentService commentService;

    @GetMapping("/{campus}")
    public List<Comment> getCommentByCampus(@PathVariable("campus") String campus){
        return this.commentService.getCommentByName(campus);
    }



    @PostMapping("/labels")
    @ResponseBody
    public List<String> labels(
            @RequestBody Labels la
    ){
//        System.out.println("控制器");
        return commentService.PartByLabels(la);
    }
}

