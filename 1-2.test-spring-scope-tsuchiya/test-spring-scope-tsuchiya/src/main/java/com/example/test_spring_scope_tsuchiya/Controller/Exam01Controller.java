package com.example.test_spring_scope_tsuchiya.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")

public class Exam01Controller {

    @RequestMapping("")
    public String index() {
        return "exam01";
    }

    @RequestMapping("/index2")
    public String index2(String mail, String password, Model model) {
        if (mail.equals("yamada@sample.com") && password.equals("yamayama")) {
            model.addAttribute("result", "成功");
            return "ex01result";
        } else {
            model.addAttribute("result", "失敗");
            return "ex01result";
        }
    }

}
