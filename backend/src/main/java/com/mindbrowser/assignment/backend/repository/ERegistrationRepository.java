package com.mindbrowser.assignment.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mindbrowser.assignment.backend.model.Employee;

public interface ERegistrationRepository extends JpaRepository<Employee, Integer>{

	Employee findByFirstnameAndLastname(String firstname, String lastname);

	List<Employee> findAllByFirstname(String firstname);


}
