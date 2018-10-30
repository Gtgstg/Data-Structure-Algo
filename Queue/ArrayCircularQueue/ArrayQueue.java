package com.company.arraycircularqueue;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;
    public ArrayQueue(int capacity){
        queue=new Employee[capacity];
    }
    public void add(Employee employee) {
        if (size()==queue.length - 1) {
            Employee[] newArray=new Employee[2*queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            System.arraycopy(queue,0,newArray,queue.length,back);
        }
    }
        public int size() {
            if(front<=back) {
                return back - front;
            }
            else{
            return back-front+queue.length;
        }
    }
}
