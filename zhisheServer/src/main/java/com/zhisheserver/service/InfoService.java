package com.zhisheserver.service;

import com.zhisheserver.entity.Info;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
