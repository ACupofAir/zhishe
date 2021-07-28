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

import java.util.List;

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

    @Update("UPDATE campus SET name='${new_name}', address='${new_adress}', school_name='${new_school_name}' WHERE name='${edit_name}'")
    void updateCampus(String new_name, String new_adress, String new_school_name,  String edit_name);

    @Update("UPDATE campus SET state='${new_state}' WHERE name='${edit_name}'")
    void updateCampusState(Integer new_state, String edit_name);


    @Select("select * from campus where name like '%${name}%'")
    List<Campus> getCampusLIst(String name);


    @Update("UPDATE campus SET facilities_score='${score1}', architecture_score='${score2}', surrounding_score='${score3}', score='${score4}' WHERE name='${edit_name}'")
    void updateCampusScore(Double score1, Double score2, Double score3,  Double score4, String edit_name);
}

