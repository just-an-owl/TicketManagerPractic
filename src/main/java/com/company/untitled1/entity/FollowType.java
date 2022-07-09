package com.company.untitled1.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum FollowType implements EnumClass<String> {

    INTERCITY("Intercity"),
    SUBURBAN("Suburban"),
    BETWEEN_CITIES("Between cities");

    private String id;

    FollowType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static FollowType fromId(String id) {
        for (FollowType at : FollowType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}