package com.lelis.housemanagement.models;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "house_management_expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal expenseValue;

    private LocalDate expenseDate;

    @Enumerated(EnumType.STRING)
    private ExpenseType expenseType;

    Expense() {
    }

    public Expense(Long id, BigDecimal expenseValue, LocalDate expenseDate, ExpenseType expenseType) {
        this.id = id;
        this.expenseValue = expenseValue;
        this.expenseDate = expenseDate;
        this.expenseType = expenseType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getExpenseValue() {
        return expenseValue;
    }

    public void setExpenseValue(BigDecimal expenseValue) {
        this.expenseValue = expenseValue;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }
}
