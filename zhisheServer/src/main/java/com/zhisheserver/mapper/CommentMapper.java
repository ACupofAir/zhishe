package com.zhisheserver.mapper;

import com.zhisheserver.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-26
 */
@Repository
public interface CommentMapper extends BaseMapper<Comment> {

    @Select("select * from comment where campus='${campus}'")
    List<Comment> getCommentByName(String campus);

    @Update("UPDATE comment SET state='${new_state}' WHERE id='${comment_id}'")
    void updateCommentState(String comment_id, Integer new_state);

//    @Select("select campus from comment where (air_conditioner, " +
//            "sofa, outdoor_balcony, washing_machine, refrigerator, cooking, wifi, " +
//            "restroom, studyroom) = (${labels[0]}, ${labels[1]}, ${labels[2]}, " +
//            "${labels[3]}, ${labels[4]}, ${labels[5]}, ${labels[6]}, ${labels[7]}, " +
//            "${labels[8]})")
//    List<String> getSchoolByLabels(int[] labels);
    @Select("select campus from comment where air_conditioner = ${label}")
    List<String> getSchoolByLabel0(int label);

    @Select("select campus from comment where sofa = ${label}")
    List<String> getSchoolByLabel1(int label);

    @Select("select campus from comment where outdoor_balcony = ${label}")
    List<String> getSchoolByLabel2(int label);

    @Select("select campus from comment where washing_machine = ${label}")
    List<String> getSchoolByLabel3(int label);

    @Select("select campus from comment where refrigerator = ${label}")
    List<String> getSchoolByLabel4(int label);

    @Select("select campus from comment where cooking = ${label}")
    List<String> getSchoolByLabel5(int label);

    @Select("select campus from comment where wifi = ${label}")
    List<String> getSchoolByLabel6(int label);

    @Select("select campus from comment where restroom = ${label}")
    List<String> getSchoolByLabel7(int label);

    @Select("select campus from comment where studyroom = ${label}")
    List<String> getSchoolByLabel8(int label);


    @Select("select * from comment where id=${id}")
    Comment getCommentById(String id);
}
