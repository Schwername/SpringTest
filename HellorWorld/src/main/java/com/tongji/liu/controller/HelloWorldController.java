package com.tongji.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liu
 * @create 2022-07-07 12:13
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String helloworld(){
        System.out.println("conflict merge hotfix");
        return "Hello World!conflict merge";
    }
}
