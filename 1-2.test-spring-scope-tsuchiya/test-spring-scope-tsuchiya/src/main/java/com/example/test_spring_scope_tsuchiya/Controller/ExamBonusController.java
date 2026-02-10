package com.example.test_spring_scope_tsuchiya.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam03")
public class ExamBonusController {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam03";
    }

}
