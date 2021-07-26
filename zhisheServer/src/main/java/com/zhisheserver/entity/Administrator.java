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
 * @since 2021-07-26
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Administrator implements Serializable {

    private static final long serialVersionUID=1L;

      private String adminId;

    private String password;

    private Boolean state;


}
