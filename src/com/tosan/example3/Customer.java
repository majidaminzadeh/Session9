package com.tosan.example3;

public class Customer {
    private String name;
    private String family;

    public Customer(String name, String family){
        setFamily(family);
        setName(name);
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
