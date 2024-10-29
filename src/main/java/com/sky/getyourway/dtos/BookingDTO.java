package com.sky.getyourway.dtos;

import com.sky.getyourway.domain.Booking;
import com.sky.getyourway.domain.User;

/*
DTO related to the Booking class
 */

public class BookingDTO {

    // *******ATTRIBUTES*******
    private int id;

    private String orderReference;

    private Integer customerId; // Foreign key

    private FlightDTO flights;

    // *******CONSTRUCTORS*******
    public BookingDTO(Booking b) {
        this.id = b.getId();
        this.orderReference = b.getOrderReference();
        if (b.getCustomer() != null) {
            this.customerId = b.getCustomer().getId();
        }
    }

    public BookingDTO() {
        super();
    }

    public BookingDTO(String orderReference, User user) {}

    // GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public FlightDTO getFlights() {
        return flights;
    }

    public void setFlights(FlightDTO flights) {
        this.flights = flights;
    }
}
