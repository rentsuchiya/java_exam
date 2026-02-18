package com.example.test_spring_thymeleaf_tsuchiya.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class ExamTymeleafController {
    @RequestMapping("")
    public String index() {
        return "ex-thymeleaf-input";
    }

    @RequestMapping("index")
    public String index2(String name, Integer age, String hobby1, String hobby2, String hobby3, Model model) {
        List<String> hobbylist = new ArrayList<>();
        hobbylist.add(hobby1);
        hobbylist.add(hobby2);
        hobbylist.add(hobby3);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("hobbylist", hobbylist);
        return "ex-thymeleaf-result";

    }

}
