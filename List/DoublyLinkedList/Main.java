package com.company.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        Employee ram=new Employee("Bhanu","Ram",98);
        Employee rahim=new Employee("Ayush","Rahim",933);
        Employee insana=new Employee("Shivu","insana",9335);
        Employee great=new Employee("Shanu","Great",007);
        EmployeeDoublyLinkedList list=new EmployeeDoublyLinkedList();
//        System.out.println(list.isEmpty());
        list.addToFront(ram);
        list.addToFront(rahim);
        list.addToFront(insana);
//        list.addToBack(great);
//        list.printListFromFront();
//        list.printListFromBack();
//        System.out.println(list.isEmpty());
//        System.out.println(list.getSize());
//        list.removeFromFront();
//        list.printListFromFront();
//        list.printListFromBack();
        System.out.println(list.addBefore(great,rahim));
        list.printListFromFront();
    }
}
