package com.tosan.example3;

import java.util.*;

public class Example3 {
    // Exception is child of Throwable
    // Exception: 1- CHECKED 2- UNCHECKED
    // 1- CHECKED (compile time):
    //      - must be handled!
    //      - Exception class subtype
    //      - Recoverable - no new version is needed
    // 2- UNCHECKED (runtime):
    //      - not need to be handled
    //      - RuntimeException class subtype
    //      - Unrecoverable - new version is needed
    public static void main(String[] args) {
        String[] titles = {"Deposit", "Deposit2", "Deposit3", "Deposit4","Deposit5"};
        Customer[] customers = {new Customer("Name1", "Family1"), new Customer("Name2", "Family2"), new Customer("Name3", "Family3"), new Customer("Name4", "Family4"), new Customer("Name5", "Family5")};
        int[] initBalances = {10, 0, 0 , 20, 100};
        try {
            Deposit[] deposits = openGroupDepositsCHECKED(titles, customers, initBalances);
            for (Deposit deposit : deposits){
                deposit.printDeposit();
            }
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        Deposit[] deposits = openGroupDepositsUNCHECKED(titles, customers, initBalances);
    }

    private static Deposit[] openGroupDepositsCHECKED(String[] titles, Customer[] customers, int[] initBalances) throws Exception {
        if (titles.length != customers.length || customers.length != initBalances.length || titles.length != initBalances.length){
            System.out.println("wrong data: different length");
            throw new Exception("different length");
        } else {
            for (String title : titles){
                if(title.isEmpty()){
                    System.out.println("wrong data: empty title");
                    throw new Exception("empty title");
                }
            }
            for (Customer customer : customers){
                if(customer == null){
                    System.out.println("wrong data: empty customer");
                    throw new Exception("empty customer");
                }
            }
            for (int initBalance : initBalances){
                if(initBalance < 0){
                    System.out.println("wrong data: negative init balance");
                    throw new Exception("negative init balance");
                }
            }
            Deposit[] deposits = new Deposit[initBalances.length];
            for (int i = 0; i < initBalances.length ; i++){
                deposits[i] = new Deposit(titles[i], customers[i], initBalances[i]);
            }
            return deposits;
        }
    }

    private static Deposit[] openGroupDepositsUNCHECKED(String[] titles, Customer[] customers, int[] initBalances) throws RuntimeException {
        if (titles.length != customers.length || customers.length != initBalances.length || titles.length != initBalances.length){
            System.out.println("wrong data: different length");
            throw new RuntimeException("different length");
        } else {
            for (String title : titles){
                if(title.isEmpty()){
                    System.out.println("wrong data: empty title");
                    throw new RuntimeException("empty title");
                }
            }
            for (Customer customer : customers){
                if(customer == null){
                    System.out.println("wrong data: empty customer");
                    throw new RuntimeException("empty customer");
                }
            }
            for (int initBalance : initBalances){
                if(initBalance < 0){
                    System.out.println("wrong data: negative init balance");
                    throw new RuntimeException("negative init balance");
                }
            }
            Deposit[] deposits = new Deposit[initBalances.length];
            for (int i = 0; i < initBalances.length ; i++){
                deposits[i] = new Deposit(titles[i], customers[i], initBalances[i]);
            }
            return deposits;
        }
    }
}
