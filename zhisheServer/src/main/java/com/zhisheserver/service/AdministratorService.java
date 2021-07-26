package com.zhisheserver.service;

import com.zhisheserver.dto.Login;
import com.zhisheserver.entity.Administrator;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.validation.annotation.Validated;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-20
 */
@Validated
public interface AdministratorService extends IService<Administrator> {
    Object LoginUser(Login login);
}
