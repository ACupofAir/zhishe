package com.zhisheserver.mapper;

import com.zhisheserver.entity.College;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
@Repository
public interface CollegeMapper extends BaseMapper<College> {
    @Select("select * from college where name='${name}'")
    College getByName(String name);
}



