package com.company.linkedlist;

public class Main {

    public static void main(String[] args) {
    	Employee ram=new Employee("Bhanu","Ram",98);
        Employee rahim=new Employee("Ayush","Rahim",933);
        Employee insana=new Employee("Shivu","insana",9335);
        Employee great=new Employee("Shanu","Great",007);
        EmployeeLinkedList list=new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(ram);
        list.addToFront(rahim);
        list.addToFront(insana);
        list.addToFront(great);
        list.printList();
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        System.out.println(list.removeFromFront());
        System.out.println(list.getSize());
        list.printList();
    }
}
