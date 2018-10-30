package com.company.bubblesort;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //bubble sort
        /*int temp = 0;
        for (int i = intArray.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }*/
        for (int lastunsortedindex = intArray.length - 1; lastunsortedindex > 0; lastunsortedindex--) {
            for (int i = 0; i < lastunsortedindex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
