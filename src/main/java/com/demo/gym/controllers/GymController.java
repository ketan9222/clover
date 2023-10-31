package com.demo.gym.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.gym.entities.Gym;
import com.demo.gym.services.GymService;

@RestController
@RequestMapping("/gyms")
public class GymController {
	
	@Autowired
	private GymService gymService;
	
	//create
	@PostMapping
	public ResponseEntity<Gym> createGym( @RequestBody Gym gym){
		return ResponseEntity.status(HttpStatus.CREATED).body(gymService.create(gym));
		
	}
	
	
	//getbyid
	@GetMapping("/{gymId}")
	public ResponseEntity<Gym> createGym(@PathVariable String gymId){
		return ResponseEntity.status(HttpStatus.OK).body(gymService.get(gymId));
		
	}
	
	
	//getall
	@GetMapping
	public ResponseEntity<List<Gym>> getAll(){
		return ResponseEntity.ok(gymService.getAll());
		
		
	}
	
	

}
