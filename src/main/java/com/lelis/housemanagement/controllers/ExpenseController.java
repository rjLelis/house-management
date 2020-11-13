package com.lelis.housemanagement.controllers;

import com.lelis.housemanagement.models.Expense;
import com.lelis.housemanagement.models.ExpenseDTO;
import com.lelis.housemanagement.models.ExpenseType;
import com.lelis.housemanagement.repositories.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseRepository repository;

    public ExpenseController(ExpenseRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Expense create(@RequestBody ExpenseDTO expense) {
        return this.repository.save(expense.toEntity());
    }

    @GetMapping
    public List<Expense> list(@RequestParam("type") Optional<ExpenseType> expenseType) {
        return expenseType.map(this.repository::findByExpenseType)
                .orElse(this.repository.findAll());
    }

}
