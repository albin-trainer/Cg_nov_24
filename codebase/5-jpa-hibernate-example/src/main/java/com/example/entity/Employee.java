package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity //mandatory
@Data// need STS plugin otherwise wont work
public class Employee {
	@Id //mandatory
	@GeneratedValue //to auto-generete empid (optional)
private int empId;
private String empName;
private String designation;

}
