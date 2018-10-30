package com.company.linkedlist;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;
    public void addToFront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        else{
            EmployeeNode removednode=head;
            head=head.getNext();
            size--;
            removednode.setNext(null);
            return removednode;
        }
    }
    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head ->");
        while (current != null) {
            System.out.print(current + "->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
