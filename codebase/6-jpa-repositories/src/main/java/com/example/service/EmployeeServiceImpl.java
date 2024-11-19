package com.example.service;
import java.util.List;
import java.util.Optional;

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
	public Employee addNewEmployeeService(Employee e) {
		return empRepo.save(e);
	}
	public Employee searchByEmpIdService(int eid) {
//		 Optional<Employee> empOptional =empRepo.findById(eid);
//		 if(empOptional.isPresent())
//			 return empOptional.get();
//		 throw new RuntimeException("Employee "+eid+" not found");
		return empRepo.findById(eid).orElseThrow(()->new RuntimeException("plz check the emp id "));
	}
	public List<Employee> allEmpsService() {
		return empRepo.findAll();
	}
	public List<Employee> searchByDesignationService(String designation) {
		return empRepo.findByDesignation(designation);
	}
	public Employee updateEmpService(Employee e) {
		 empRepo.findById(e.getEmpId()).orElseThrow(()->new RuntimeException("plz check the emp id "));
		return  empRepo.save(e); //work for add/edit
	}

}
