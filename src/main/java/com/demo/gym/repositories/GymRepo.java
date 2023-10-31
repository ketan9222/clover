package com.demo.gym.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.gym.entities.Gym;

public interface GymRepo extends JpaRepository<Gym, String>{

}
