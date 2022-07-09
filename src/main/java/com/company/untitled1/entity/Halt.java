package com.company.untitled1.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "HALT")
@Entity
public class Halt {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CITY", nullable = false)
    @NotNull
    private String city;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "COORDINATES", nullable = false)
    @NotNull
    private String coordinates;

    @JoinTable(name = "ROUTE_HALT_LINK",
            joinColumns = @JoinColumn(name = "HALT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROUTE_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Route> routes;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}