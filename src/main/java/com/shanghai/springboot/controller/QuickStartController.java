package com.shanghai.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;


    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "springboot 访问成功!";
    }


    @RequestMapping("/quick1")
    @ResponseBody
    public String quick1(){
        return "springboot 访问成功! name="+name+",age="+age;
    }
}