package com.company.countingsort;

public class Main {

    public static void main(String[] args) {
	    int[] intArray={2,5,9,8,2,8,7,10,4,3};
	    countArraay(intArray,1,10);
	    for(int i=0;i<intArray.length;i++){
	        System.out.println(intArray[i]);
        }
    }
    public static void countArraay(int[] input,int min,int max){
        int[] count=new int[max-min+1];
        for(int i=0;i<input.length;i++){
            count[input[i]-min]++;
        }
        int j=0;
        for(int i=min;i<=input.length;i++){
            while(count[i-min]-->0){
                input[j++]=i;
                //System.out.println(i);
            }
        }

    }
}
