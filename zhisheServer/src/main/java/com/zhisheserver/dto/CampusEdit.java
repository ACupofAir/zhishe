package com.zhisheserver.dto;

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
