package com.zhisheserver.service;

import com.zhisheserver.entity.Info;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
public interface InfoService extends IService<Info> {
//    Info getInfoById(Integer id);
    Object updateInfoCommentId(String new_id);

    Integer getInfoCommentNum();

    void updateInfoCommentNum(Integer new_commentNum);


    Integer getInfoCommentNotPost();

    void updateInfoCommentNotPosted(Integer new_commentPosted);

    Integer getInfoCommentPost();

    void updateInfoCommentPosted(Integer new_commentPosted);
}
