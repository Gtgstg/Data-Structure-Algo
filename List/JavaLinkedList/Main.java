package com.company.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    Employee bhanu=new Employee("Bhanu","Boka",23);
        Employee bhan=new Employee("Bhan","Bka",23223);
        Employee shanu=new Employee("Shanu","Boka",22233);
        Employee S=new Employee("S","Boka",33);
        Employee S4=new Employee("434434S","Bok4343a",3333334);
        LinkedList list=new LinkedList();
        list.addFirst(S);
        list.addFirst(shanu);
        list.addFirst(bhan);
        list.addFirst(bhanu);
        Iterator iter=list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        list.addLast(S4);
        list.add(S4);
        iter=list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        list.removeLast();
        list.remove();
        list.removeFirst();
        iter=list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
