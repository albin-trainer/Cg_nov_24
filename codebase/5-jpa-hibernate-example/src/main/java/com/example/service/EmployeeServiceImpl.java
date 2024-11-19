package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public Employee addNewEmployeeService(Employee e) {
		// TODO Auto-generated method stub
		return empRepo.addNewEmployee(e);
	}

	@Override
	public Employee searchByEmpIdService(int eid) {
		// TODO Auto-generated method stub
		return empRepo.searchByEmpId(eid);
	}

	@Override
	public List<Employee> allEmpsService() {
		// TODO Auto-generated method stub
		return empRepo.allEmps();
	}

	@Override
	public List<Employee> searchByDesignationService(String designation) {
		// TODO Auto-generated method stub
		return empRepo.searchByDesignation(designation);
	}

	@Override
	public Employee updateEmpService(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

}
