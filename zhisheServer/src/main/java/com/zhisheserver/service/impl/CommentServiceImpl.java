package com.zhisheserver.service.impl;

import com.zhisheserver.entity.Comment;
import com.zhisheserver.entity.Info;
import com.zhisheserver.mapper.CommentMapper;
import com.zhisheserver.result.Result;
import com.zhisheserver.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhisheserver.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-07-23
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {


    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> getCommentByName(String name){
        return this.commentMapper.getCommentByName(name);
    }


    public Object saveComment(Comment comment){
        this.commentMapper.insert(comment);
        return comment;
    }


    public Object updateCommentState(String comment_id, Integer new_state){
        this.commentMapper.updateCommentState(comment_id, new_state);
        return new Result(1);
    }
}
