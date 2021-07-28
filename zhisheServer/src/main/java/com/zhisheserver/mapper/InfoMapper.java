package com.zhisheserver.mapper;

import com.zhisheserver.entity.Info;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

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


    @Select("SELECT commentNum FROM info WHERE id=1")
    Integer getInfoCommentNum();

    @Update("UPDATE info SET commentNum='${new_commentNum}' WHERE id=1")
    void updateInfoCommentNum(Integer new_commentNum);

    @Select("SELECT commentNotPosted FROM info WHERE id=1")
    Integer getInfoCommentNotPost();

    @Update("UPDATE info SET commentNotPosted='${new_commentNotPosted}' WHERE id=1")
    void updateInfoCommentNotPosted(Integer new_commentNotPosted);


    @Select("SELECT commentPosted FROM info WHERE id=1")
    Integer getInfoCommentPost();

    @Update("UPDATE info SET commentPosted='${new_commentNotPosted}' WHERE id=1")
    void updateInfoCommentPosted(Integer new_commentPosted);

}
