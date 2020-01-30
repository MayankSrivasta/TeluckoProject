package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien2(Alien alien) {
		repo.save(alien);  
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien2(@RequestParam int aid) {
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		
		System.out.println(repo.findByTech("java"));
		
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAlien() {
		return repo.findAll().toString();
	} 
	
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien3(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	} 
		
}
 