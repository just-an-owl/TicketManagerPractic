package com.company.untitled1.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "PASSENGER")
@Entity
public class Passenger {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotEmpty
    @NotNull
    @Column(name = "FULL_NAME")
    private String fullName;

    @PositiveOrZero
    @Positive
    @NotNull
    @Column(name = "NUMBER_OF_PASSPORT")
    private Integer numberOfPassport;

    @OneToMany(mappedBy = "prassenger")
    private List<Trip> trip;

    public List<Trip> getTrip() {
        return trip;
    }

    public void setTrip(List<Trip> trip) {
        this.trip = trip;
    }

    public Integer getNumberOfPassport() {
        return numberOfPassport;
    }

    public void setNumberOfPassport(Integer numberOfPassport) {
        this.numberOfPassport = numberOfPassport;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}