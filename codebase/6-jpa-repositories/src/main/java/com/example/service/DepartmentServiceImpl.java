package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
 private DepartmentRepository departmentRepo;
	public Department addNewDepartment(Department d) {
		return departmentRepo.save(d);
	}
}
