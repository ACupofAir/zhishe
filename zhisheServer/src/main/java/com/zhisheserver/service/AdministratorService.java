package com.zhisheserver.service;

import com.zhisheserver.dto.Login;
import com.zhisheserver.entity.Administrator;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
public interface AdministratorService extends IService<Administrator> {
    Object LoginUser(Login login);
}
