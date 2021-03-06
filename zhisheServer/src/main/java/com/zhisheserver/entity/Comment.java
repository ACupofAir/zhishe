package com.zhisheserver.entity;

import java.time.LocalDateTime;
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
 * @since 2021-07-26
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Comment implements Serializable {

    private static final long serialVersionUID=1L;

      private String id;

    private String campus;

    private String dorm;

    private String location;

    private Integer year;

    private Integer grade;

    private Integer scale;

    private Boolean recommend;

    private String email;

    private Integer facilities;

    private Integer architecture;

    private Integer surrounding;

    private Integer score;

    private String photo;

    private String briefComment;

    private Boolean airConditioner;

    private Boolean sofa;

    private Boolean outdoorBalcony;

    private Boolean washingMachine;

    private Boolean refrigerator;

    private Boolean cooking;

    private Boolean wifi;

    private Boolean restroom;

    private LocalDateTime timeStamp;

    private Boolean studyroom;

    private Boolean state;

    @TableField("isNewSchool")
    private Boolean isNewSchool;

    @TableField("isNewCampus")
    private Boolean isNewCampus;

    @TableField("isChecked")
    private Boolean isChecked;


}
