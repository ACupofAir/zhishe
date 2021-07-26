package com.zhisheserver.controller;


import com.zhisheserver.entity.Comment;
import com.zhisheserver.mapper.CommentMapper;
import com.zhisheserver.service.CommentService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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



}

