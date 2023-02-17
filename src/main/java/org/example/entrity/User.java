package org.example.entrity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private String address;

    private Date createTime;

    private Date updateTime;

}