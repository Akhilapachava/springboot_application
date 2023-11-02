package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.Dept_Repository;
import com.example.demo.Service.Dept_Service;
import com.example.demo.dept.entity.Dept_entity;


@Controller
@RestController
public class Dept_controller {
	@Autowired Dept_Service dept_service;
	@Autowired Dept_Repository dept_repo;
	
    @PostMapping(value = "/postdata")
	public Dept_entity postdata(@RequestBody Dept_entity dept_entity) {
		return dept_service.postdata(dept_entity);
		
	}
    
    @GetMapping(value = "/Getdata")
	public List<Dept_entity> getDetail() {
		return dept_service.getDetails();

	}

	
	

}
