package com.comapay.linkedstack;

public class Main {
    public static void main(String[] args) {
        Emloyee r=new Emloyee("fefe","fefe",3223);
        Emloyee v=new Emloyee("fefdddfdsfssdasde","fefedf",3223232);
        Emloyee rd=new Emloyee("fefesaaaaaaaaaaaaa","fefefdsf",658768);
        Emloyee rdd=new Emloyee("fefexccxxxc","fefegfdsfdsf",3265765);
        linkedstack stack=new linkedstack();
        stack.push(r);
        stack.push(v);
        stack.push(rd);
        stack.push(rdd);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println(stack.peek());
    }
}


