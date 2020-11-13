package com.lelis.housemanagement.repositories;

import com.lelis.housemanagement.models.Expense;
import com.lelis.housemanagement.models.ExpenseType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByExpenseType(ExpenseType expenseType);
}
