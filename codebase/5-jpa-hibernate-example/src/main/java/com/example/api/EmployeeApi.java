package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeApi {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping
  public ResponseEntity<Employee> addEmployee(@RequestBody Employee e){
	  return new ResponseEntity<Employee>(employeeService.addNewEmployeeService(e),HttpStatus.CREATED);
  }
	@GetMapping("/{eid}")
  public ResponseEntity<Employee> searchById( @PathVariable int eid){
		Employee e=employeeService.searchByEmpIdService(eid);
	  return new ResponseEntity<Employee>(e,HttpStatus.OK);
  }
	@GetMapping
  public ResponseEntity<List<Employee>> allEmps(){
		List<Employee> elist=employeeService.allEmpsService();
	  return new ResponseEntity<List<Employee>>(elist,HttpStatus.OK);
  }
	@GetMapping("/search")
  public ResponseEntity<List<Employee>> searchByDesignation(@RequestParam  String designation){
		List<Employee> elist=employeeService.searchByDesignationService(designation);
		  return new ResponseEntity<List<Employee>>(elist,HttpStatus.OK);
  }
	@PutMapping
  public ResponseEntity<Employee> updateEmp(@RequestBody Employee e){
	  return null;
  }
}
