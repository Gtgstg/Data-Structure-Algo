package com.company.shellsort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int firstunsorted = gap; firstunsorted < intArray.length; firstunsorted++) {
                int k = intArray[firstunsorted];
                int j;
                for (j = firstunsorted; j > 0 && intArray[j - gap] > k; j -= gap) {
                    intArray[j] = intArray[j - gap];
                }
                intArray[j] = k;
            }
        }
        for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);

        }

    }
}