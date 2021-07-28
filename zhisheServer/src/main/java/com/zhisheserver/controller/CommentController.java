package com.zhisheserver.controller;


import com.zhisheserver.dto.ComState;
import com.zhisheserver.dto.Labels;
import com.zhisheserver.entity.Comment;
import com.zhisheserver.entity.Info;
import com.zhisheserver.service.CommentService;
import com.zhisheserver.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post")
    @ResponseBody
    public Object saveComment(
            @RequestBody Comment comment
            ){
        Info info = this.infoService.getById(1);
        int comId;
        comId = Integer.parseInt(info.getCommentId()) + 1;
        comment.setId(Integer.toString(comId));
        this.infoService.updateInfoCommentId(comment.getId());
        return commentService.saveComment(comment);
    }

    @PostMapping("/updateState")
    @ResponseBody
    public Object updateCommentState(
            @RequestBody ComState comState
    ){
        System.out.println(comState.getComment_id());
        return commentService.updateCommentState(comState.getComment_id(), comState.getComment_state());
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
