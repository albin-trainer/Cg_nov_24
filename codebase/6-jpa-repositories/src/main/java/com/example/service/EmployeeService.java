package com.example.service;

import java.util.List;

import com.example.dto.EmployeeDto;
import com.example.entity.Employee;

public interface EmployeeService {
	Employee addNewEmployeeService(EmployeeDto e);
	Employee searchByEmpIdService(int eid);
	List<Employee> allEmpsService();
	List<Employee> searchByDesignationService(String designation);
	Employee updateEmpService(Employee e);
}
