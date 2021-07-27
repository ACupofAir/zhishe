package com.zhisheserver.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhisheserver.entity.College;
import com.zhisheserver.mapper.CollegeMapper;
import com.zhisheserver.service.CollegeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
@Service
public class CollegeServiceImpl extends ServiceImpl<CollegeMapper, College> implements CollegeService {
    @Autowired
    private CollegeMapper collegeMapper;

    public College getByName(String name){
        return this.collegeMapper.getByName(name);
    }

    public Object saveCollege(College college){
        collegeMapper.insert(college);
        return college;
    }
}





