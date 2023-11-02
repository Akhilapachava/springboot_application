package com.example.demo.dept.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Dept")
public class Dept_entity {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long deptid;
 private String deptname;

 public Long getDeptid() {
	return deptid;
}
public void setDeptid(Long deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
 
	
	

}
