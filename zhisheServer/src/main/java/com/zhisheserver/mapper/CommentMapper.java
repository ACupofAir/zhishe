package com.zhisheserver.mapper;

import com.zhisheserver.entity.College;
import com.zhisheserver.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
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
<<<<<<< HEAD



=======
>>>>>>> 7b199dcf1d86baf3e1a8b1d241db1ed7dea5c090
}
