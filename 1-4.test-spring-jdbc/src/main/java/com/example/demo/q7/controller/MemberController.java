package com.example.demo.q7.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.q7.domain.Member;
import com.example.demo.q7.repository.MemberRepository;


@Controller
@RequestMapping("ex07")
public class MemberController {
	@Autowired
	private MemberRepository repository;
	
	@RequestMapping("")
	public String index(Model model) {

		Member member=new Member();
		List<Member> list=new ArrayList<>();
		list=(repository.findAll());
		model.addAttribute("list", list);
		
		
		return "findAllResult";
	}
}
