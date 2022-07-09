package com.company.untitled1.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeOfTransport implements EnumClass<String> {

    BUS("Bus"),
    AIRPLANE("Airplane"),
    TRAIN("Train");

    private String id;

    TypeOfTransport(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeOfTransport fromId(String id) {
        for (TypeOfTransport at : TypeOfTransport.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}