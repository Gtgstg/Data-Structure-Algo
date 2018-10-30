package com.company.arrayqueue;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lasttName;
    private int id;

    public Employee(String firstName, String lasttName, int id) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lasttName, employee.lasttName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lasttName, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
