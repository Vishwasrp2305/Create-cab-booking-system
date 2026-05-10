package com.cabbooking.model;

public class Cab {
      private String type; // Mini, Sedan, SUV, Luxury
    private double ratePerKm;

    public Cab() {}

    public Cab(String type, double ratePerKm) {
              this.type = type;
              this.ratePerKm = ratePerKm;
    }

    public String getType() {
              return type;
    }

    public void setType(String type) {
              this.type = type;
    }

    public double getRatePerKm() {
              return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
              this.ratePerKm = ratePerKm;
    }
}
