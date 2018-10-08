package com.shanghai.springboot.controller;

import com.shanghai.springboot.domain.Tuser;
import com.shanghai.springboot.mapper.TuserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapperController {
    @Autowired
    private TuserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<Tuser> queryUser() {
        List<Tuser> users = userMapper.queryUserList();
        return users;
    }

    @RequestMapping("/getUser")
    @Cacheable(value="user.findAll12222")
    public  List<Tuser> getUser() {
        List<Tuser> users = userMapper.queryUserList();
//        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return users;
    }
}