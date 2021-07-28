package com.zhisheserver.service;


import com.zhisheserver.entity.Campus;
import com.zhisheserver.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhisheserver.mapper.CampusMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
public interface CampusService extends IService<Campus> {

    Campus getByName(String name);

    Object saveCampus(Campus campus);

    List<Double> GetAllScores(List<String> t);

    Integer getCampusComment_num(String name);

    void updateCampusComment_num(Integer new_comment_num, String name);

}


