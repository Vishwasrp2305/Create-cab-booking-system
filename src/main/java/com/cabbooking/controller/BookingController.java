package com.cabbooking.controller;

import com.cabbooking.model.Booking;
import com.cabbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
  @RequestMapping("/api/bookings")
  @CrossOrigin(origins = "*")
  public class BookingController {

    private final BookingService bookingService;

    @Autowired
        public BookingController(BookingService bookingService) {
                  this.bookingService = bookingService;
        }

    @PostMapping
        public ResponseEntity<?> createBooking(@RequestBody Booking booking) {
                  try {
                                Booking processedBooking = bookingService.processBooking(booking);
                                return ResponseEntity.ok(processedBooking);
                  } catch (IllegalArgumentException e) {
                                return ResponseEntity.badRequest().body(e.getMessage());
                  } catch (Exception e) {
                                return ResponseEntity.internalServerError().body("An error occurred while processing the booking.");
                  }
        }

    @GetMapping
        public ResponseEntity<List<Booking>> getBookingHistory() {
                  return ResponseEntity.ok(bookingService.getBookingHistory());
        }
  }
