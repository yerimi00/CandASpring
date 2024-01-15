package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.domain.Project;
import com.springmvc.service.ProjectService;

@Controller
public class MainPageController {
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String welcome(Model  model) {
		model.addAttribute("mainText", "MainPage ¿‘¥œ¥Ÿ.");
		
		return "main";
	}
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String requestProjectMethod(Model  model) {
		List<Project> list = projectService.getAllProjectList();
		model.addAttribute("ProjectList", list);
		
		return "main";
	}

}
