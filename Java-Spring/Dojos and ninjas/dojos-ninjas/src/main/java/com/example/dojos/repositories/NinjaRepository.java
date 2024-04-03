package com.example.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.dojos.models.Dojo;
import com.example.dojos.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
