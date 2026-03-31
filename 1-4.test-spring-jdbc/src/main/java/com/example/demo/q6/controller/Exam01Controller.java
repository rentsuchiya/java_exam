package com.example.demo.q6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Exam01Controller {
    @RequestMapping("")
    public String index(){
        return "exam01";
    }

    @RequestMapping("/index3")
    public String index3(String mail,String pass,Model model){
        if(mail.equals("yamada@sample.com")&&pass.equals("yamayama")){
            model.addAttribute("result","成功");
            return "result";
        }else{
            model.addAttribute("result","失敗");
            return "result";
        }
    }
}
