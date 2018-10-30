package com.company.seive;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Seive
{  static boolean a[];
    public static void seive(){
        a=new boolean[10001];
        for(int i=2;i*i<=10000;i++){
            if(a[i]==false){
                for(int j=i+i;j<=10000;j+=i){
                    a[j]=true;
                }
            }
        }
    }
    public static void main (String[] args)
    {
        seive();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            for(int i=2;i<n/2.0;i++){
                if(a[i]==false && a[n-i]==false){
                    System.out.println(i+" "+(n-i));
                    break;
                }
            }
        }
    }
}
