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

<<<<<<< HEAD

    @Autowired
    private CommentMapper commentMapper;
=======
    @Autowired CommentMapper commentMapper;
>>>>>>> 7b199dcf1d86baf3e1a8b1d241db1ed7dea5c090

    public List<Comment> getCommentByName(String name){
        return this.commentMapper.getCommentByName(name);
    }

<<<<<<< HEAD
    public Object saveComment(Comment comment){
        commentMapper.insert(comment);
        return comment;
    }
=======
>>>>>>> 7b199dcf1d86baf3e1a8b1d241db1ed7dea5c090
}
