package com.cabbooking.model;

public class Passenger {
      private String name;
      private String mobileNumber;

    public Passenger() {}

    public Passenger(String name, String mobileNumber) {
              this.name = name;
              this.mobileNumber = mobileNumber;
    }

    public String getName() {
              return name;
    }

    public void setName(String name) {
              this.name = name;
    }

    public String getMobileNumber() {
              return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
              this.mobileNumber = mobileNumber;
    }
}
