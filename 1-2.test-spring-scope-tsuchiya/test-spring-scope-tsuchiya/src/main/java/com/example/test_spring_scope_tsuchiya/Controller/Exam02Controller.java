package com.example.test_spring_scope_tsuchiya.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam02";
    }

    @RequestMapping("/index2")
    public String index2(Integer num1, Integer num2) {
        Integer num3 = num1 + num2;
        session.setAttribute("result", num3);
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        return "exam02.result";
    }

    @RequestMapping("/out2")
    public String out() {
        return "exam02-result2";
    }

}
