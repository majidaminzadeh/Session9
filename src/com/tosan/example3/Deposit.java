package com.tosan.example3;

public class Deposit {
    private String title;
    private Customer customer;
    private int balance;

    public Deposit(String title, Customer customer, int initBalance){
        setBalance(initBalance);
        setCustomer(customer);
        setTitle(title);
    }

    public void printDeposit(){
        System.out.println(getTitle() + " is for " + getCustomer() + " has " + getBalance() + " balance");
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBalance() {
        return balance;
    }
}
