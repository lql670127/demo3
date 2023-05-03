package com.example.demo2.mysql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User,Integer>{
}
