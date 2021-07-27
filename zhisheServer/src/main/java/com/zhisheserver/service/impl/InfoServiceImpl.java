package com.zhisheserver.service.impl;

import com.zhisheserver.entity.Info;
import com.zhisheserver.mapper.InfoMapper;
import com.zhisheserver.service.InfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements InfoService {

//    @Autowired InfoMapper infoMapper;
//
//    public Info getInfoById(Integer id){
//        infoMapper.
//    }
}
