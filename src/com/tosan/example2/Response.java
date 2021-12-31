package com.tosan.example2;

public class Response {
    private Deposit[] deposits;
    private int status;

    public Response(int status, Deposit[] deposits){
        setDeposits(deposits);
        setStatus(status);
    }

    public void setDeposits(Deposit[] deposits) {
        this.deposits = deposits;
    }

    public Deposit[] getDeposits() {
        return deposits;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
