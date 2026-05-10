package com.cabbooking.model;

import java.time.LocalDateTime;

public class Booking {
      private String bookingId;
      private Passenger passenger;
      private Cab cab;
      private String pickupLocation;
      private String dropLocation;
      private double distance;
      private LocalDateTime bookingDateTime;
      private Payment payment;

    public Booking() {}

    public String getBookingId() { return bookingId; }
      public void setBookingId(String bookingId) { this.bookingId = bookingId; }

    public Passenger getPassenger() { return passenger; }
      public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    public Cab getCab() { return cab; }
      public void setCab(Cab cab) { this.cab = cab; }

    public String getPickupLocation() { return pickupLocation; }
      public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    public String getDropLocation() { return dropLocation; }
      public void setDropLocation(String dropLocation) { this.dropLocation = dropLocation; }

    public double getDistance() { return distance; }
      public void setDistance(double distance) { this.distance = distance; }

    public LocalDateTime getBookingDateTime() { return bookingDateTime; }
      public void setBookingDateTime(LocalDateTime bookingDateTime) { this.bookingDateTime = bookingDateTime; }

    public Payment getPayment() { return payment; }
      public void setPayment(Payment payment) { this.payment = payment; }
}
