package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Dept_Repository;
import com.example.demo.dept.entity.Dept_entity;


@Service
public class Dept_Service {
	@Autowired Dept_Repository dept_repo;
	
	public Dept_entity postdata(Dept_entity dept_entity) {
		return dept_repo.save(dept_entity);
		
	}
	 
	public List<Dept_entity> getDetails() {
		return dept_repo.findAll();

	}

}
