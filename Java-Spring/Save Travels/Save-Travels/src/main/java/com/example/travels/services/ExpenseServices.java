package com.example.travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.travels.models.Expense;
import com.example.travels.repository.ExpensesRepo;



@Service
public class ExpenseServices {
	private final ExpensesRepo expensesRepo;
	
	public ExpenseServices(ExpensesRepo expensesRepo) {
		this.expensesRepo = expensesRepo;
	}
	
	public List<Expense> allExpenses(){
		return expensesRepo.findAll();
	}
	
	public Expense createExpense(Expense expense) {
		return expensesRepo.save(expense);
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expensesRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}else {
			return null;
		}
	}
	
	public Expense updateExpense(Expense expense) {
		return expensesRepo.save(expense);
	}
	
	public void deleteExpense(Expense expense) {
		expensesRepo.delete(expense);
	}

}
