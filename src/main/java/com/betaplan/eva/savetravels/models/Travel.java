package com.betaplan.eva.savetravels.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name="travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=1 ,max=100)
    private String expense;
    @NotNull
    @Size(min=1 ,max=100)
    private String vendor;
    @NotNull
    @Min(value = 0)
    private Double amount;

    @NotNull
    @Size(min=1 ,max=100)
    private String description;
    public Travel(){

     }

    public Travel(Long id, String expense, String vendor, Double amount, String description) {
        this.id = id;
        this.expense = expense;
        this.vendor = vendor;
        this.amount = amount;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public void addAttribute(String allTravels, List<Travel> travels) {
//    }
}
