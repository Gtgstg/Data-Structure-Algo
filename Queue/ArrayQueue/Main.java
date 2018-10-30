package com.company.arrayqueue;

public class Main {

    public static void main(String[] args) {

        Employee ram=new Employee("Bhanu","Ram",98);
        Employee rahim=new Employee("Ayush","Rahim",933);
        Employee insana=new Employee("Shivu","insana",9335);
        Employee great=new Employee("Shanu","aaa",007);
        ArrayQueue queue=new ArrayQueue(10);
        queue.add(ram);
        queue.add(rahim);
        queue.add(insana);
        queue.add(great);
        queue.print();
        System.out.println(queue.peek());
        queue.remove();
        queue.print();
    }
}
