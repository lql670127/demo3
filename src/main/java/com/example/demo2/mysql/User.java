package com.example.demo2.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private int id;
    private String name;
    private int age;
    private String sex;
    private String address;

    //    测试
    public static void main(String[] args) {
        System.out.println("hello git! hello liuql!");
        System.out.println("hot-fix test!");
        System.out.println("master test");
        System.out.println("idea push test");
        System.out.println("idea pull test");
    }
}
