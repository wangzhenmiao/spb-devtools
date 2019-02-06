package com.wangzhen.spbdevtools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author momo
 * @Date 2019/2/5 下午8:51
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("项目的热部署！xxxxx");
        return "输出到web页面的字符串！xxx";
    }
}
