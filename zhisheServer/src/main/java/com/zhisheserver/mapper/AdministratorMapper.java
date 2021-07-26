package com.zhisheserver.mapper;

import com.zhisheserver.dto.Login;
import com.zhisheserver.entity.Administrator;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhisheserver.result.LoginResult;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
public interface AdministratorMapper extends BaseMapper<Administrator> {



    @Select("SELECT * FROM administrator where admin_id='${adminID}'")
    Administrator getAdminByID(String adminID);

}
