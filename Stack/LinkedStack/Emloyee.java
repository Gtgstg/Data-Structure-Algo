package com.comapay.linkedstack;

import java.util.Objects;

public class Emloyee {
    private String firstname;

    @Override
    public String toString() {
        return "Emloyee{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    private String lastName;
    private int id;

    public Emloyee(String firstname, String lastName, int id) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emloyee emloyee = (Emloyee) o;
        return id == emloyee.id &&
                Objects.equals(firstname, emloyee.firstname) &&
                Objects.equals(lastName, emloyee.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstname, lastName, id);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
