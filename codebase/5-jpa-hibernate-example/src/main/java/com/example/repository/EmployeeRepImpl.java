package com.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
@Repository
public class EmployeeRepImpl  implements EmployeeRepository{
	@PersistenceContext
  private EntityManager em;
	@Override
	public Employee addNewEmployee(Employee e) {
		em.persist(e);//saves in the DB
		return e;
	}
	public Employee searchByEmpId(int eid) {
	Employee e=	em.find(Employee.class, eid);//to find by the PK
		return e;
	}
	public List<Employee> allEmps() {
		String jpql="select e from Employee e";//jpql=Java Persistence Query Lang
		Query q= em.createQuery(jpql);
		List<Employee>  emplist=q.getResultList();
		return emplist;
	}
	public List<Employee> searchByDesignation(String designation) {
		String jpql="select e from Employee e where e.designation = :d";
		Query q= em.createQuery(jpql);
		q.setParameter("d", designation);
		List<Employee>  emplist=q.getResultList();
		return emplist;
	}

	@Override
	public Employee updateEmp(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

}
