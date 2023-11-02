package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dept.entity.Dept_entity;

@Repository
public interface Dept_Repository extends JpaRepository<Dept_entity,Long>{

}
