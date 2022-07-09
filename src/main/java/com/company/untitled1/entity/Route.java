package com.company.untitled1.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "ROUTE")
@Entity
public class Route {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "FOLLOW_TYPE", nullable = false)
    @NotNull
    private String followType;

    @Column(name = "TYPE_OF_TRANSPORT", nullable = false)
    @NotNull
    private String typeOfTransport;

    @InstanceName
    @Column(name = "ROUTE_NAME", nullable = false)
    @NotNull
    private String routeName;

    @JoinTable(name = "ROUTE_HALT_LINK",
            joinColumns = @JoinColumn(name = "ROUTE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "HALT_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Halt> halts;

    public FollowType getFollowType() {
        return followType == null ? null : FollowType.fromId(followType);
    }

    public void setFollowType(FollowType followType) {
        this.followType = followType == null ? null : followType.getId();
    }

    public List<Halt> getHalts() {
        return halts;
    }

    public void setHalts(List<Halt> halts) {
        this.halts = halts;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public TypeOfTransport getTypeOfTransport() {
        return typeOfTransport == null ? null : TypeOfTransport.fromId(typeOfTransport);
    }

    public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
        this.typeOfTransport = typeOfTransport == null ? null : typeOfTransport.getId();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}