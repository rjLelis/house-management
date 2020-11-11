package com.lelis.housemanagement.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExpenseDTO {

    @JsonProperty("expense_value")
    private BigDecimal expenseValue;

    @JsonProperty("expense_type")
    private ExpenseType expenseType;

    public BigDecimal getExpenseValue() {
        return expenseValue;
    }

    public void setExpenseValue(BigDecimal expenseValue) {
        this.expenseValue = expenseValue;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public Expense toEntity() {
        return new Expense(null, this.expenseValue, LocalDate.now(), this.expenseType);
    }
}
