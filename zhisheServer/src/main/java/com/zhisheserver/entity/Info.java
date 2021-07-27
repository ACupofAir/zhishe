package com.zhisheserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Info implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("commentNum")
    private Integer commentNum;

    @TableField("adminNum")
    private Integer adminNum;

    @TableField("commentId")
    private String commentId;

    @TableField("commentPosted")
    private Integer commentPosted;

    @TableField("commentNotPosted")
    private Integer commentNotPosted;

    @TableField("collegeNum")
    private Integer collegeNum;

    @TableField("campusNum")
    private Integer campusNum;

    private Integer views;

    @TableField("searchNum")
    private Integer searchNum;


}
