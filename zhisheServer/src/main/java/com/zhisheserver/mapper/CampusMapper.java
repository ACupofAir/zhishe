package com.zhisheserver.mapper;

import com.zhisheserver.entity.Campus;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhisheserver.service.CampusService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
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
public interface CampusMapper extends BaseMapper<Campus> {
    @Select("select * from campus where name='${name}'")
    Campus getByName(String name);
}

