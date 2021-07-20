package com.zhisheserver.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2021-07-20
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class College implements Serializable {

    private static final long serialVersionUID=1L;

      private String name;

    private String address;

    private String coord;

    private String image;

    private String campus1;

    private String campus2;

    private String campus3;

    private String campus4;

    private String campus5;

    private Integer campusNum;

    private Integer commentNum;

    private Integer state;

    private Integer scanNum;


}
