package com.company.linkedlist;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Employee employee = (Employee)o;
            return this.id == employee.id && Objects.equals(this.firstName, employee.firstName) && Objects.equals(this.lastName, employee.lastName);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.firstName, this.lastName, this.id});
    }

    public String toString() {
        return "Employee{firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + ", id=" + this.id + '}';
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
}
