package com.zhisheserver.service;

import com.zhisheserver.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-23
 */
public interface CommentService extends IService<Comment> {

    List<Comment> getCommentByName(String name);

    Object saveComment(Comment comment);
}
