package com.demo.gym.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gym.entities.Gym;
import com.demo.gym.exceptions.ResourceNotFoundException;
import com.demo.gym.repositories.GymRepo;
import com.demo.gym.services.GymService;

@Service
public class GymServiceImpl implements GymService {
	
	@Autowired
	private GymRepo gymrepo;

	@Override
	public Gym create(Gym gym) {
		String gymId = UUID.randomUUID().toString(); 
		gym.setId(gymId);
		return gymrepo.save(gym);
	}

	@Override
	public List<Gym> getAll() {
		// TODO Auto-generated method stub
		return gymrepo.findAll();
	}

	@Override
	public Gym get(String id) {
		// TODO Auto-generated method stub
		return gymrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("gym with given id not found !!") );
	}

}
