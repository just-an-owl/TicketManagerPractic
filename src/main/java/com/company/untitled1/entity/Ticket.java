package com.company.untitled1.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "TICKET", indexes = {
        @Index(name = "IDX_TICKET_TRIP_ID", columnList = "TRIP_ID"),
        @Index(name = "IDX_TICKET_ROUTE", columnList = "ROUTE_ID")
})
@Entity
public class Ticket {
    @InstanceName
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "NUMBER_")
    private Integer number;

    @Column(name = "POINT_OF_DEPARTURE")
    private String pointOfDeparture;

    @Column(name = "DEPARTURE_DATE")
    private LocalDateTime departureDate;

    @Column(name = "POINT_OF_ARRIVAL")
    private String pointOfArrival;

    @Column(name = "ARRIVAL_DATE")
    private LocalDateTime arrivalDate;

    @Column(name = "PRICE")
    private Double price;

    @JoinColumn(name = "TRIP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Trip trip;

    @JoinColumn(name = "ROUTE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Route route;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getPointOfArrival() {
        return pointOfArrival;
    }

    public void setPointOfArrival(String pointOfArrival) {
        this.pointOfArrival = pointOfArrival;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public String getPointOfDeparture() {
        return pointOfDeparture;
    }

    public void setPointOfDeparture(String pointOfDeparture) {
        this.pointOfDeparture = pointOfDeparture;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}