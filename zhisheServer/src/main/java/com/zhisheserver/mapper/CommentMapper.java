package com.zhisheserver.mapper;

import com.zhisheserver.entity.College;
import com.zhisheserver.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CompletionException;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-23
 */
@Repository
public interface CommentMapper extends BaseMapper<Comment> {

    @Select("select * from comment where campus='${campus}'")
    List<Comment> getCommentByName(String campus);

    @Update("UPDATE comment SET state='${new_state}' WHERE id='${comment_id}'")
    void updateCommentState(String comment_id, Integer new_state);

}

