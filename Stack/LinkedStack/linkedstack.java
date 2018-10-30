package com.comapay.linkedstack;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedstack {
    private LinkedList<Emloyee> stack;
    public linkedstack(){
        stack=new LinkedList<Emloyee>();
    }

    public void push(Emloyee employee){
        stack.push(employee);
    }
    public Emloyee pop(){
        return stack.pop();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public Emloyee peek(){
        return stack.pop();
    }
    public int size(){
        return stack.size();
    }
    public void printStack(){
        ListIterator<Emloyee> iter=stack.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
