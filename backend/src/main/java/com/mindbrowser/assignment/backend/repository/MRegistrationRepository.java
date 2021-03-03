package com.mindbrowser.assignment.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mindbrowser.assignment.backend.model.Manager;

public interface MRegistrationRepository extends JpaRepository<Manager, Integer> {

	public Manager findByEmail(String email);
	public Manager findByEmailAndPassword(String email, String password);
}
