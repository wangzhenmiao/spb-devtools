package com.wangzhen.spbdevtools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController2
 * @Description
 * @Author momo
 * @Date 2019/2/5 下午9:01
 **/

@RestController
public class HelloController2 {

    @RequestMapping("/hellonew")
    public String hello2(){
        System.out.println("hello new !!!yyyaxxx");
        return "hellonew!输出到页面的字符串！yyyxaa";
    }
}
