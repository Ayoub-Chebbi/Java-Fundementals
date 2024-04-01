package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.models.Buger;
import com.example.repository.BurgerRepo;

@Service
public class BurgerService {
	private final BurgerRepo burgerRepo;
	
	public BurgerService(BurgerRepo burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
	
	public List<Buger> allBurgers(){
		return burgerRepo.findAll();
	}
	
	public Buger createBurger(Buger buger) {
		return burgerRepo.save(buger);
	}
}
