package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Buger;
import com.example.services.BurgerService;

import jakarta.validation.Valid;


@Controller
public class BurgerController {
	
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("/")
	public String home(@ModelAttribute("burger") Buger burger, Model model) {
		List<Buger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	
	@PostMapping("/addBurger")
	public String home(@Valid @ModelAttribute("burger") Buger burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Buger> burgers = burgerService.allBurgers();
			model.addAttribute("burgers", burgers);
			return "index.jsp";
		}
		burgerService.createBurger(burger);
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String editBurger(@PathVariable("id") Long id, @ModelAttribute("burger") Buger burger, Model model) {
		model.addAttribute("burger", burgerService.findBurger(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String updateBurger(@Valid @ModelAttribute("burger") Buger burger, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("burger", burger);
			return "index.jsp";
		}
		burgerService.updateBurger(burger);
		return "redirect:/";
	}
}
