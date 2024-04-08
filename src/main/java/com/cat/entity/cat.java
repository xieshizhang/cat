package com.cat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: cat
 * @Description: 猫的实体类
 * @Author: xieshizhang
 * @CreateTime: 2024-04-08 22:53
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cat {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String color;
    private String breed;
    private String description;
    private String location;

}
