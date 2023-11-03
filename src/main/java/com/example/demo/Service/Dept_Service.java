package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Repository.Dept_Repository;
import com.example.demo.dept.entity.Dept_entity;


@Service
public class Dept_Service {
	@Autowired 
	Dept_Repository dept_repo;
	@Autowired 
	RestTemplate restTemplate;
	
	public Dept_entity postdata(Dept_entity dept_entity) {
		return dept_repo.save(dept_entity);
		
	}
	 
	public Object getDetails() {
		String url="https://surgetechnologysolutions.appiancloud.com/suite/webapi/getEmployee";
		HttpHeaders headers =new HttpHeaders();
		headers.set("name", "AkhilaPachava");
		headers.set("password", "Akhila@19");
		HttpEntity<String> httpEntity = new HttpEntity<>(headers);
		ResponseEntity<Object> forEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, Object.class);
		Object body = forEntity.getBody();
		return body;

	}

}
