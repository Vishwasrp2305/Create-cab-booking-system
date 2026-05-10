package com.cabbooking.service;

import com.cabbooking.model.Booking;
import com.cabbooking.model.Cab;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
  public class BookingService {

    private final List<Booking> bookingHistory = new ArrayList<>();

    public Booking processBooking(Booking bookingRequest) {
              if (bookingRequest.getPassenger().getMobileNumber() == null || bookingRequest.getPassenger().getMobileNumber().length() != 10) {
                            throw new IllegalArgumentException("Mobile number must be exactly 10 digits.");
              }
              if (bookingRequest.getDistance() <= 0) {
                            throw new IllegalArgumentException("Distance must be greater than zero.");
              }
              if (bookingRequest.getPickupLocation().equalsIgnoreCase(bookingRequest.getDropLocation())) {
                            throw new IllegalArgumentException("Pickup and Drop locations cannot be the same.");
              }

            double rate = getRateForCabType(bookingRequest.getCab().getType());
              double baseFare = 50.0;
              double subTotal = baseFare + (rate * bookingRequest.getDistance());
              double tax = subTotal * 0.05;
              double totalFare = subTotal + tax;

            bookingRequest.setBookingId("BKG-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase());
              bookingRequest.setBookingDateTime(LocalDateTime.now());
              bookingRequest.getCab().setRatePerKm(rate);

            if (bookingRequest.getPayment() != null) {
                          bookingRequest.getPayment().setAmount(totalFare);
                          bookingRequest.getPayment().setStatus("Success");
            }

            bookingHistory.add(0, bookingRequest);
              return bookingRequest;
    }

    public List<Booking> getBookingHistory() {
              return bookingHistory;
    }

    private double getRateForCabType(String type) {
              return switch (type.toLowerCase()) {
                case "mini" -> 10.0;
                case "sedan" -> 15.0;
                case "suv" -> 20.0;
                case "luxury" -> 30.0;
                              default -> throw new IllegalArgumentException("Invalid cab type selected.");
              };
    }
  }
