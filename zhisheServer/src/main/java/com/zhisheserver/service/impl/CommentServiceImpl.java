package com.zhisheserver.service.impl;

import com.zhisheserver.dto.Labels;
import com.zhisheserver.entity.Comment;
import com.zhisheserver.mapper.CommentMapper;
import com.zhisheserver.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {


    @Autowired
    CommentMapper commentMapper;

    public List<Comment> getCommentByName(String name){
        return this.commentMapper.getCommentByName(name);
    }

    @Override
    public List<String> PartByLabels(Labels la) {
//        String[] t = la.getLabels();
//        System.out.println("实现");
        List<String> temp = Arrays.asList(la.getLabels());
//        int[] labels = new int[9];
//        Arrays.fill(labels, 0);
//        System.out.println(labels);
        List<String> f = new ArrayList();
//        List<String> s = new ArrayList();
        if(temp.contains("空调"))
        {
            f = commentMapper.getSchoolByLabel0(1);
        }
        if(temp.contains("沙发"))
        {
            if(f.size() == 0)
                f = commentMapper.getSchoolByLabel1(1);
            else
            {
                f = getBoth(f, commentMapper.getSchoolByLabel1(1));
            }
        }
        if(temp.contains("室外阳台"))
        {
            if(f.size() == 0)
                f = commentMapper.getSchoolByLabel2(1);
            else
            {
                f = getBoth(f, commentMapper.getSchoolByLabel2(1));
            }
        }
        if(temp.contains("洗衣机"))
        {
            if(f.size() == 0)
                f = commentMapper.getSchoolByLabel3(1);
            else
            {
                f = getBoth(f, commentMapper.getSchoolByLabel3(1));
            }
        }
        if(temp.contains("冰箱"))
        {
            if(f.size() == 0)
                f = commentMapper.getSchoolByLabel4(1);
            else
            {
                f = getBoth(f, commentMapper.getSchoolByLabel4(1));
            }
        }
        if(temp.contains("可烹饪"))
        {
            if(f.size() == 0)
                f = commentMapper.getSchoolByLabel5(1);
            else
            {
                f = getBoth(f, commentMapper.getSchoolByLabel5(1));
            }
        }
        if(temp.contains("无线网络"))
        {
            if(f.size() == 0)
                f = commentMapper.getSchoolByLabel6(1);
            else
            {
                f = getBoth(f, commentMapper.getSchoolByLabel6(1));
            }
        }
        if(temp.contains("独立卫浴"))
        {
            if(f.size() == 0)
                f = commentMapper.getSchoolByLabel7(1);
            else
            {
                f = getBoth(f, commentMapper.getSchoolByLabel7(1));
            }
        }
        if(temp.contains("自习室"))
        {
            if(f.size() == 0)
                f = commentMapper.getSchoolByLabel8(1);
            else
            {
                f = getBoth(f, commentMapper.getSchoolByLabel8(1));
            }
        }
//        System.out.println(Arrays.toString(labels));
        String[] t;
//        for(int i = 0; i < f.size(); i++)
//        {
//            t = f.get(i).split("-");
//            f.set(i, t[0]);
//        }
        HashSet h = new HashSet(f);
        f.clear();
        f.addAll(h);

        return f;
    }

    @Override
    public List<String> getBoth(List<String> f, List<String> s) {
        List<String> re = new ArrayList();
        int n = f.size() >= s.size()? s.size():f.size();
        if(f.size() >= s.size())
        {
            for(int i = 0; i < n; i++)
            {
                if(f.contains(s.get(i)))
                    re.add(s.get(i));
            }
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                if(s.contains(f.get(i)))
                    re.add(f.get(i));
            }
        }
        return re;
    }
}
