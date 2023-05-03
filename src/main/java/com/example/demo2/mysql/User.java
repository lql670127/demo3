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
}
