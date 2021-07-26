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
 * @since 2021-07-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Campus implements Serializable {

    private static final long serialVersionUID=1L;

      private String name;

    private Double score;

    private String address;

    private Integer commentNum;

    private Double facilitiesScore;

    private Double architectureScore;

    private Double surroundingScore;

    private Boolean state;

    private String schoolName;


}
