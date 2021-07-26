package com.zhisheserver.service;

import com.zhisheserver.entity.Campus;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhisheserver.entity.College;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-21
 */
public interface CampusService extends IService<Campus> {
    Campus getByName(String name);
}
