package com.avinash.parkinglot.models;

public abstract class BaseModel {
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    abstract Object toDto();
}
