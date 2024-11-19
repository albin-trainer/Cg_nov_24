package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {
	Employee addNewEmployeeService(Employee e);
	Employee searchByEmpIdService(int eid);
	List<Employee> allEmpsService();
	List<Employee> searchByDesignationService(String designation);
	Employee updateEmpService(Employee e);
}
