package com.zhisheserver.controller;


import com.zhisheserver.dto.Login;
import com.zhisheserver.entity.Comment;
import com.zhisheserver.entity.Info;
import com.zhisheserver.mapper.CommentMapper;
import com.zhisheserver.service.CommentService;
import com.zhisheserver.service.InfoService;
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
    private CommentService commentService;

    @Autowired
    private InfoService infoService;

    @GetMapping("/{campus}")
    public List<Comment> getCommentByCampus(@PathVariable("campus") String campus){
        return this.commentService.getCommentByName(campus);
    }

    @PostMapping("/post")
    @ResponseBody
    public Object saveComment(
            @RequestBody Comment comment
    ){
        Info info = this.infoService.getById(1);
        comment.setId(info.getCommentId().toString());
        return commentService.saveComment(comment);
    }



}

