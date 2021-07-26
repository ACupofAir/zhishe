package com.zhisheserver.mapper;

import com.zhisheserver.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
@Repository
public interface CommentMapper extends BaseMapper<Comment> {

    @Select("select * from comment where campus='${campus}'")
    List<Comment> getCommentByName(String campus);


}
