package com.zhisheserver.controller;


import com.zhisheserver.dto.ComState;
import com.zhisheserver.dto.Labels;
import com.zhisheserver.entity.Campus;
import com.zhisheserver.entity.Comment;
import com.zhisheserver.entity.Info;
import com.zhisheserver.mapper.CampusMapper;
import com.zhisheserver.mapper.CollegeMapper;
import com.zhisheserver.result.Result;
import com.zhisheserver.service.CampusService;
import com.zhisheserver.service.CollegeService;
import com.zhisheserver.service.CommentService;
import com.zhisheserver.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.SortedMap;

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

    @Autowired
    private CampusService campusService;

    @Autowired
    private CollegeService collegeService;

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
        //设置commentId
        Info info = this.infoService.getById(1);
        int comId;
        comId = Integer.parseInt(info.getCommentId()) + 1;
        comment.setId(Integer.toString(comId));
        this.infoService.updateInfoCommentId(comment.getId());


        //更新commentNum
        this.infoService.updateInfoCommentNum(this.infoService.getInfoCommentNum() + 1);
        this.infoService.updateInfoCommentNotPosted(this.infoService.getInfoCommentNotPost() + 1);

        return commentService.saveComment(comment);
    }

    @PostMapping("/updateState")
    @ResponseBody
    public Object updateCommentState(
            @RequestBody ComState comState
    ){

        Comment comment =  this.commentService.getCommentById(comState.getComment_id());
        if(comState.getComment_state() == 1){
            this.infoService.updateInfoCommentNotPosted(this.infoService.getInfoCommentNotPost() - 1);
            this.infoService.updateInfoCommentPosted(this.infoService.getInfoCommentPost() + 1);
            this.campusService.updateCampusComment_num(this.campusService.getCampusComment_num(comment.getCampus()) + 1, comment.getCampus());
            String collegeName = comment.getCampus().split("-")[0];
            this.collegeService.updateCollegeComment_num(this.collegeService.getCollegeComment_num(collegeName) + 1, collegeName);

            //更新校区评分
            List<Comment> allComment = this.commentService.getCommentByName(comment.getCampus());
            Double score1 = 0.0,score2 = 0.0,score3 = 0.0, score4 = 0.0;
            for(int i = 0; i < allComment.size(); i++){
                score1 += allComment.get(i).getFacilities().doubleValue();
                score2 +=allComment.get(i).getArchitecture().doubleValue();
                score3 += allComment.get(i).getSurrounding().doubleValue();
                score4 += allComment.get(i).getScore().doubleValue();
            }
            score1 = score1 / allComment.size();
            score2 = score2 / allComment.size();
            score3 = score3 / allComment.size();
            score4 = score4 / allComment.size();
            this.campusService.updateCampusScore(score1,score2,score3,score4,comment.getCampus());
        }
        else {
            this.infoService.updateInfoCommentNotPosted(this.infoService.getInfoCommentNotPost() + 1);
            this.infoService.updateInfoCommentPosted(this.infoService.getInfoCommentPost() - 1);
            this.campusService.updateCampusComment_num(this.campusService.getCampusComment_num(comment.getCampus()) - 1, comment.getCampus());
            String collegeName = comment.getCampus().split("-")[0];
            this.collegeService.updateCollegeComment_num(this.collegeService.getCollegeComment_num(collegeName) - 1, collegeName);
        }
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

    //根据id获取单条评价
    @GetMapping("/id/{id}")
    public Object getCommentById(@PathVariable("id") String id){
        Comment comment =  this.commentService.getCommentById(id);
        if (comment == null) return new Result(2);
        else return comment;
    }

}
