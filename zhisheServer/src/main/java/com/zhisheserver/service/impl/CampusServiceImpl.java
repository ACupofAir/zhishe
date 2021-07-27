package com.zhisheserver.service.impl;

import com.zhisheserver.entity.Campus;
import com.zhisheserver.entity.College;
import com.zhisheserver.mapper.CampusMapper;
import com.zhisheserver.mapper.CollegeMapper;
import com.zhisheserver.service.CampusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-07-21
 */
@Service
public class CampusServiceImpl extends ServiceImpl<CampusMapper, Campus> implements CampusService {
    @Autowired
    private CampusMapper campusMapper;

    public Campus getByName(String name) {
        return this.campusMapper.getByName(name);
    }
}
