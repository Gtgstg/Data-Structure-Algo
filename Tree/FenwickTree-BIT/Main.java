package com.company.FenwickTree;

public class Main {

    public static void main(String[] args) {
        FenwickTree t=new FenwickTree(5);
        t.set(1,4);
        t.set(2,5);
        t.set(3,6);
        t.set(4,889);
        t.set(5,22);
        System.out.println(t.toString());
        t.add(2,10);
        System.out.println(t.toString());
    }
}
