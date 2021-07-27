package com.zhisheserver.controller;


import com.zhisheserver.dto.Login;
import com.zhisheserver.entity.Comment;
<<<<<<< HEAD
import com.zhisheserver.entity.Info;
import com.zhisheserver.mapper.CommentMapper;
import com.zhisheserver.service.CommentService;
import com.zhisheserver.service.InfoService;
import org.apache.ibatis.annotations.Select;
=======
import com.zhisheserver.service.CommentService;
>>>>>>> 7b199dcf1d86baf3e1a8b1d241db1ed7dea5c090
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
 * @since 2021-07-23
 */
@RestController
@RequestMapping("//comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private InfoService infoService;

    @GetMapping("/list")
    public List<Comment> list(){
        return this.commentService.list();
    }

    @GetMapping("/{campus}")
    public List<Comment> getCommentByCampus(@PathVariable("campus") String campus){
        return this.commentService.getCommentByName(campus);
    }

<<<<<<< HEAD
    @PostMapping("/post")
    @ResponseBody
    public Object saveComment(
            @RequestBody Comment comment
    ){
        Info info = this.infoService.getById(1);
        comment.setId(info.getCommentId().toString());
        return commentService.saveComment(comment);
    }



=======
>>>>>>> 7b199dcf1d86baf3e1a8b1d241db1ed7dea5c090
}

