package com.zhisheserver.service.impl;

import com.zhisheserver.dto.Login;
import com.zhisheserver.entity.Administrator;
import com.zhisheserver.mapper.AdministratorMapper;
import com.zhisheserver.result.LoginResult;
import com.zhisheserver.service.AdministratorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
@Service
public class AdministratorServiceImpl extends ServiceImpl<AdministratorMapper, Administrator> implements AdministratorService {




    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Object LoginUser(Login login) {
        String id = login.getAdminID();
        String pw = login.getPassword();
        System.out.println(id);
        System.out.println(pw);
//        return administratorMapper.getAdminByID(id);
        if(administratorMapper.getAdminByID(id) == null)
        {
            System.out.println("未找到用户");
            return new LoginResult(1);
        }
        else if(!pw.equals(administratorMapper.getAdminByID(id).getPassword()) )
        {
            System.out.println("密码错误");
            return new LoginResult(2);
        }
        else
        {
            System.out.println("登录成功");
            return administratorMapper.getAdminByID(id);
        }
    }

}
