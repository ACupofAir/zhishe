package com.zhisheserver.mapper;

import com.zhisheserver.entity.Campus;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhisheserver.service.CampusService;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    @Select("SELECT comment_num FROM campus WHERE name='${name}'")
    Integer getCampusComment_num(String name);

    @Update("UPDATE campus SET comment_num='${new_comment_num}' WHERE name='${name}'")
    void updateCampusComment_num(Integer new_comment_num, String name);
}

