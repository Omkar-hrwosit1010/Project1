package com.mindbrowser.assignment.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindbrowser.assignment.backend.model.Manager;
import com.mindbrowser.assignment.backend.repository.MRegistrationRepository;


@Service
public class MRegistrationService {
	@Autowired
	private MRegistrationRepository repo;
	
	public Manager saveManager(Manager manager)
	{
		return repo.save(manager);
	}
	public Manager fetchManagerByEmail(String email)
	{
		return repo.findByEmail(email);
	}
	public Manager fetchManagerByEmailAndPassword(String email, String password)
	{
		return repo.findByEmailAndPassword(email, password);
	}

}
