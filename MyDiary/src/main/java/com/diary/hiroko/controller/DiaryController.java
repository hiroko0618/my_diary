package com.diary.hiroko.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diary.hiroko.entity.Diary;
import com.diary.hiroko.service.DiaryService;

@Controller
@RequestMapping("/diary")
public class DiaryController {
	
	@Autowired
	private DiaryService service;
	
	@GetMapping("/index")
	public String getContent (Model model) {
		
		List<Diary> contentList = new ArrayList<>();
		contentList = service.getAll();
		
		model.addAttribute("contentList", contentList);
		
		return "/index";
	}
}