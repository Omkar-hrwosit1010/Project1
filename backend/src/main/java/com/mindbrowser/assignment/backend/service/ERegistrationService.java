package com.mindbrowser.assignment.backend.service;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindbrowser.assignment.backend.model.Employee;

import com.mindbrowser.assignment.backend.repository.ERegistrationRepository;


@Service
public class ERegistrationService {
	
	@Autowired
	private ERegistrationRepository erepo;
	
	public Employee saveEmployee(Employee emp)
	{
		return erepo.save(emp);
	}
	
	public List<Employee> findAll() {
		return erepo.findAll();
	}
	public List<Employee> findByFirstname(String firstname) {
		return erepo.findAllByFirstname(firstname);
	}

	public void deleteById(int id) {
		erepo.deleteById(id);
		
		
	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return erepo.save(employee);
	}

	

	
	
	


}
