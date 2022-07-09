package com.company.untitled1.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "TRIP", indexes = {
        @Index(name = "IDX_TRIP_PRASSENGER_ID", columnList = "PRASSENGER_ID")
})
@Entity
public class Trip {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "PRASSENGER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Passenger prassenger;

    @OneToMany(mappedBy = "trip")
    private List<Ticket> tickets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Passenger getPrassenger() {
        return prassenger;
    }

    public void setPrassenger(Passenger prassenger) {
        this.prassenger = prassenger;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}