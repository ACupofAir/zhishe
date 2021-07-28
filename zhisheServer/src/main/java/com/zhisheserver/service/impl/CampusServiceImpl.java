package com.zhisheserver.service.impl;

import com.zhisheserver.entity.Campus;
import com.zhisheserver.mapper.CampusMapper;
import com.zhisheserver.result.Result;
import com.zhisheserver.service.CampusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.DecimalFormat;
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
public class CampusServiceImpl extends ServiceImpl<CampusMapper, Campus> implements CampusService {
    @Autowired
    private CampusMapper campusMapper;

    public Campus getByName(String name) {
        return this.campusMapper.getByName(name);
    }

    public Object saveCampus(Campus campus) {
        campusMapper.insert(campus);
        return campus;
    }

    public Object updateCampus(String new_name, String new_adress, String new_school_name, String edit_name){
        this.campusMapper.updateCampus(new_name, new_adress, new_school_name, edit_name);
        return new Result(1);
    }

    public Object updateCampusState(Integer new_state, String edit_name){
        this.campusMapper.updateCampusState(new_state, edit_name);
        return new Result(1);
    }

    @Override
    public List<Double> GetAllScores(List<String> t) {
        System.out.println("实现!!");
        List<Double> re = new ArrayList();
        List<Double> cam = new ArrayList();
        List<String> names = new ArrayList();
        System.out.println(t.size());
        for(int i = 0; i < t.size(); i++)
        {
            System.out.println("查找");
            Campus temp = campusMapper.getByName(t.get(i));
            System.out.println("查找");
            names.add(temp.getSchoolName());
            cam.add((temp.getScore() + temp.getArchitectureScore() +
                    temp.getFacilitiesScore() + temp.getSurroundingScore()) / 4);
        }
        HashSet h = new HashSet(names);
        List<String> sch = new ArrayList();
        sch.addAll(h);
        int[] num = new int[sch.size()];
        Arrays.fill(num, 0);
        DecimalFormat df=new DecimalFormat("0.0");
        for(int i = 0 ; i < sch.size(); i++)
        {
            re.add(0.00);
            for(int j = 0; j < names.size(); j++)
            {
                if(names.get(j).equals(sch.get(i)))
                {
                    num[i]++;
                    re.set(i, re.get(i) + cam.get(j));
                }
            }
            re.set(i, Double.valueOf(df.format(re.get(i) / num[i])));
        }
        return re;
    }

    public Integer getCampusComment_num(String name){
        return this.campusMapper.getCampusComment_num(name);
    }

    public void updateCampusComment_num(Integer new_comment_num, String name){
        this.campusMapper.updateCampusComment_num(new_comment_num, name);
    }
}







