package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity //mandatory
@Data// need STS plugin otherwise wont work
public class Employee {
	//@Id //mandatory
	
	//@GeneratedValue //to auto-generete empid (optional) //start val is 1 in default
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator ="myseq" )
	@SequenceGenerator(name="myseq",sequenceName = "emp_seq",initialValue = 1000)
private int empId;
private String empName;
private String designation;

}
