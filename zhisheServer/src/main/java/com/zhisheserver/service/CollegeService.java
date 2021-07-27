package com.zhisheserver.service;

import com.zhisheserver.entity.College;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
public interface CollegeService extends IService<College> {

    College getByName(String name);

    Object saveCollege(College college);

}
