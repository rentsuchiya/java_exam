package com.example.demo.q5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex05")
public class ReceiveNameController {

    @RequestMapping("")
    public String index(){
        return "name-form";
    }

    @RequestMapping("/index2")
    public String index2(String name){
        System.out.println(name);
        return "finished";
    }
}
