package com.zhisheserver.mapper;

import com.zhisheserver.entity.Administrator;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-20
 */
@Repository
public interface AdministratorMapper extends BaseMapper<Administrator> {
    @Select("SELECT * FROM administrator where admin_id='${adminID}'")
    Administrator getAdminByID(String adminID);
}
