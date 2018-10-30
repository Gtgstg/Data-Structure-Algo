package com.company.coinchange;

public class Main {

    public static void main(String[] args) {
        int[] v={1,2,3};
        int[] b={2,5,3,6};
        CoinChange c=new CoinChange();
        System.out.println(c.naive(4,v,0));
        System.out.println(c.DP(4,v));
        System.out.println(c.DP(10,b));
    }
}
