package com.zhisheserver.mapper;

import com.zhisheserver.entity.College;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    @Update("UPDATE campus SET name='${new_name}', address='${new_adress}', school_name='${school_name}' WHERE name='${edit_name}'")
    void updateCampus(String new_name, String new_adress, String school_name,  String edit_name);
}



