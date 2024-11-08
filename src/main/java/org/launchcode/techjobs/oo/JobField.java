package org.launchcode.techjobs.oo;

import java.util.Objects;


public abstract class JobField {

    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        this.id = nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

        //generate override for hashCode, equals object o, and toString methods
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //Generate Getters and Setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
