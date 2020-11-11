package com.lelis.housemanagement.controllers;

import com.lelis.housemanagement.models.Expense;
import com.lelis.housemanagement.models.ExpenseDTO;
import com.lelis.housemanagement.repositories.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Expense> list() {
        return this.repository.findAll();
    }

}
