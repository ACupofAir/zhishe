package com.zhisheserver.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Login {

    String adminID;
    String password;

//    public String getID(){return this.adminID;}
}
