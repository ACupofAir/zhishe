package com.zhisheserver.mapper;

import com.zhisheserver.entity.Campus;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhisheserver.entity.College;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-21
 */
@Repository
public interface CampusMapper extends BaseMapper<Campus> {

    @Select("select * from campus where name='${name}'")
    Campus getByName(String name);
}
