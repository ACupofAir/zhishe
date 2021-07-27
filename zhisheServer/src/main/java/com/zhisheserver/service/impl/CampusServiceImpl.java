package com.zhisheserver.service.impl;

import com.zhisheserver.entity.Campus;
import com.zhisheserver.mapper.CampusMapper;
import com.zhisheserver.service.CampusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
@Service
public class CampusServiceImpl extends ServiceImpl<CampusMapper, Campus> implements CampusService {
    @Autowired
    private CampusMapper campusMapper;

    public Campus getByName(String name) {
        return this.campusMapper.getByName(name);
    }

    public Object saveCampus(Campus campus){
        campusMapper.insert(campus);
        return campus;
    }
}







