package com.zhisheserver.service.impl;

import com.zhisheserver.entity.Comment;
import com.zhisheserver.mapper.CommentMapper;
import com.zhisheserver.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired CommentMapper commentMapper;

    public List<Comment> getCommentByName(String name){
        return this.commentMapper.getCommentByName(name);
    }



}
