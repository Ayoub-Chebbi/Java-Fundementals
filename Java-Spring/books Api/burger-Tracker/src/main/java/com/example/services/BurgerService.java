package com.example.services;

import java.util.List;
import java.util.Optional;

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
	
	public Buger findBurger(Long id) {
		Optional<Buger> optionalBurger = burgerRepo.findById(id);
		if(optionalBurger.isPresent()) {
			return optionalBurger.get();
		}
		return null;
	}
	
	public Buger updateBurger(Buger burger) {
		return burgerRepo.save(burger);
	}
}
