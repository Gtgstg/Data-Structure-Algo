package com.company.stacks;

public class Main {

    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(10);
        stack.push(new Employee("p","hi",21));
        stack.push(new Employee("peeeppeoe","hidbjbdb",21));
        stack.push(new Employee("pepep","hddhdhidi",21));
        stack.push(new Employee("pepepe","hddbjdi",23));
        //stack.print();
        //stack.pop();
        //stack.print();
        System.out.println(stack.peek());



    }
}