package com.zhisheserver.dto;

/**
 * @author thisisbadBao
 * @Date 2021--28-1:19 PM
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CampusEdit {
    String newName;
    String newAdress;
    String newSchoolName;
    String editName;
}
