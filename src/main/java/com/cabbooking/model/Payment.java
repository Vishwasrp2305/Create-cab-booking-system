package com.cabbooking.model;

public class Payment {
      private String method; // Cash, Card, UPI
    private double amount;
      private String status;

    public Payment() {}

    public Payment(String method, double amount, String status) {
              this.method = method;
              this.amount = amount;
              this.status = status;
    }

    public String getMethod() {
              return method;
    }

    public void setMethod(String method) {
              this.method = method;
    }

    public double getAmount() {
              return amount;
    }

    public void setAmount(double amount) {
              this.amount = amount;
    }

    public String getStatus() {
              return status;
    }

    public void setStatus(String status) {
              this.status = status;
    }
}
