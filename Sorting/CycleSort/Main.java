package com.company.cyclesort;

public class Main {

    public static void main(String[] args) {
        int[] a = {2, 5, 3, 1};
        int cycle;
        int item = a[0];
        int c;
        for (cycle=1; cycle < a.length - 1;) {
            int i=cycle;
            while (a[i] < item){i++;}
            c = a[i];
            a[i] = item;
            item = c;
        }
    }
}
