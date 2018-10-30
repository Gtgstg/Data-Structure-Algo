package com.company.insertionsort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int firstunsorted = 1;firstunsorted< intArray.length; firstunsorted++) {
            int k = intArray[firstunsorted];
            int j;
            for (j = firstunsorted; j > 0 && intArray[j - 1]>k; j--) {
                intArray[j]=intArray[j-1];
            }
            intArray[j]=k;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}