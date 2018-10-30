package com.company.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList();
        employeeList.add(new Employee("Shanu","Papa",007));
        employeeList.add(new Employee("Bhanu","Boka",700));
        employeeList.add(new Employee("Shanu","G",1));
        employeeList.add(new Employee("S","J",100));
        employeeList.forEach(new Consumer<Employee>() {
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());
        employeeList.set(3,new Employee("Bhanu","Ledamon",23));
        employeeList.forEach(employee ->System.out.println(employee));
        System.out.println(employeeList.size());
        employeeList.add(3,new Employee("Bhanu","Don",000));
        employeeList.forEach(employee->System.out.println(employee));
        Employee[] employeeArray=employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee:employeeArray){
            System.out.println(employee);
        }
        System.out.println(employeeList.contains(new Employee("Bhanu","Don", 0)));
        System.out.println(employeeList.indexOf(new Employee("Bhanu","Ledamon",23)));
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
