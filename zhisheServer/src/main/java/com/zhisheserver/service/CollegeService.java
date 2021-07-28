package com.zhisheserver.service;

import com.zhisheserver.entity.College;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
public interface CollegeService extends IService<College> {

    College getByName(String name);

    Object saveCollege(College college);

    Integer getCollegeComment_num(String name);

    void updateCollegeComment_num(Integer new_comment_num, String name);

    Integer getCollegeCampus_num(String name);

    void updateCollegeCampusNum(Integer campus_num, String name);
}
