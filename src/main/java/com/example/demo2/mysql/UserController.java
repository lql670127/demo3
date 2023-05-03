package com.example.demo2.mysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;


//      查询
    @GetMapping("/getAll")
    public List getAll(){
        List all=userDao.findAll();
        return all;
    }

    //    添加数据到数据库，更新数据库里的数据
    @GetMapping("/addData")
    public User addData(
            @RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            @RequestParam("sex") String sex,
            @RequestParam("address") String address
    ){
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        user.setAddress(address);
        User save=userDao.save(user);
        return save;

    }

//    删除数据库里的单条数据
    @GetMapping("/deleteData")
    public String deleteData(@RequestParam("id") int id){
        userDao.deleteById(id);
        return "删除成功";
    }
}
