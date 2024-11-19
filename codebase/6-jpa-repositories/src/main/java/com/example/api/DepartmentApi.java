package com.example.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Department;
import com.example.service.DepartmentService;
@RestController
public class DepartmentApi {
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/departments")
public ResponseEntity<Department> addNewDepartment(@RequestBody Department d){
	return new ResponseEntity<Department>(departmentService.addNewDepartment(d),HttpStatus.CREATED);
}
}
