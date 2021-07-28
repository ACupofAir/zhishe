package com.zhisheserver.mapper;

import com.zhisheserver.entity.Info;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@Repository
public interface InfoMapper extends BaseMapper<Info> {

    @Update("UPDATE info SET commentId='${new_id}' WHERE id=1")
    void updateInfoCommentId(String comment_id);
}
