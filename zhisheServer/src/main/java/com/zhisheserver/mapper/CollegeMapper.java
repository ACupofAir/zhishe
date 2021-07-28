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

    @Select("SELECT comment_num FROM college WHERE name='${name}'")
    Integer getCollegeComment_num(String name);

    @Update("UPDATE college SET comment_num='${new_comment_num}' WHERE name='${name}'")
    void updateCollegeComment_num(Integer new_comment_num, String name);

    @Select("SELECT campus_num FROM college WHERE name='${name}'")
    Integer getCollegeCampus_num(String name);

    @Update("UPDATE college SET campus_num='${campus_num}' WHERE name='${name}'")
    void updateCollegeCampusNum(Integer campus_num, String name);
}



