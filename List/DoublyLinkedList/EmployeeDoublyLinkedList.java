package com.company.doublylinkedlist;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;
    public void addToFront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        if(size==0){
            tail=node;
        }
        else{
            node.getNext().setPrevious(head);
        }
        size++;
    }
    public void addToBack(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setPrevious(tail);
        tail.setNext(tail);
        tail=node;
        if(size==0){
            head=node;
        }
        else {
            node.getPrevious().setNext(tail);
        }
            size++;
    }
    public void printListFromFront(){
        EmployeeNode current=head;
        System.out.print("Head <=>");
        while(current!=null){
            System.out.print(current +"<=>");
            current=current.getNext();
        }
        System.out.println("null");
    }
    public void printListFromBack(){
        EmployeeNode current=tail;
        System.out.print("Tail <=>");
        while(current!=null){
            System.out.print(current +"<=>");
            current=current.getPrevious();
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        if(head==null ){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addBefore(Employee employeeToBe,Employee employeeBefore){
        if(size==0){
            return false;
        }
        EmployeeNode track=head;
        while(track!=null && !track.getEmployee().equals(employeeBefore)){
            track=track.getNext();
        }
        if(track==null){
            return false;
        }
        EmployeeNode node=new EmployeeNode(employeeToBe);
        node.setNext(track);
        node.setPrevious(track.getPrevious());
        if(head==track){
            head=node;
            }
        else {
            track.getPrevious().setNext(node);
        }
        track.setPrevious(node);
            //also node.getPrevious().setNext(node); works
        size++;
        return true;
    }
    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        if(head.getNext()==null){
            tail=null;
        }
        else{
            head.getNext().setPrevious(null);
        }
          EmployeeNode removedNode=head;
          head=removedNode.getNext();
          size--;
          removedNode.setNext(null);
          removedNode.setPrevious(null);
          return removedNode;

    }
    public EmployeeNode removeFromBack(){
        if(isEmpty()){
            return null;
        }
        if(tail.getPrevious()==null){
            head=null;
        }
        else{
            tail.getPrevious().setNext(null);
            }
            EmployeeNode removedNode=tail;
            tail=removedNode.getPrevious();
            size--;
            removedNode.setNext(null);
            removedNode.setPrevious(null);
            return removedNode;
    }
}
