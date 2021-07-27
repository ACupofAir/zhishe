package com.zhisheserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author thisisbadBao
 * @Date 2021--27-7:44 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComState {
    String comment_id;

    Integer comment_state;
}
