package com.zhisheserver.service.impl;

import com.zhisheserver.entity.Info;
import com.zhisheserver.mapper.InfoMapper;
import com.zhisheserver.result.Result;
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

    @Autowired
    private InfoMapper infoMapper;

    public Object updateInfoCommentId(String new_id){
        this.infoMapper.updateInfoCommentId(new_id);
        return  new Result(1);
    }
}
