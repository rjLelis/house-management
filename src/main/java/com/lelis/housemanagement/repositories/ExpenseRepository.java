package com.lelis.housemanagement.repositories;

import com.lelis.housemanagement.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
