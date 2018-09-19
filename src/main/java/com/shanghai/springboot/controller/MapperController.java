package com.shanghai.springboot.controller;

import com.shanghai.springboot.domain.Tuser;
import com.shanghai.springboot.mapper.TuserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapperController {
    @Autowired
    private TuserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<Tuser> queryUser() {
        List<Tuser> users = userMapper.queryUserList();
        return users;
    }
}