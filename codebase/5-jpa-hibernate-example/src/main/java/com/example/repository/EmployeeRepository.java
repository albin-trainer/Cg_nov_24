package com.example.repository;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeRepository {
	Employee addNewEmployee(Employee e);
	Employee searchByEmpId(int eid);
	List<Employee> allEmps();
	List<Employee> searchByDesignation(String designation);
	Employee updateEmp(Employee e);
}
