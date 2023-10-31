package com.demo.gym.services;

import java.util.List;

import com.demo.gym.entities.Gym;

public interface GymService {
	
	//create
	Gym create(Gym gym);
	
	//getall
	List<Gym> getAll()
;
	
	//getbyid
	Gym get(String id);

}
