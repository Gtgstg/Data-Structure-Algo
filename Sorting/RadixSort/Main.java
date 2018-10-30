package com.company.radixsort;

public class Main {

    public static void main(String[] args) {
	    int [] radixArray={4725,4586,1330,8792,1594,5729};
	    radixsort(radixArray,4,10);
	    for(int i=0;i<radixArray.length;i++){
	        System.out.println(radixArray[i]);
        }
    }
    public static void radixsort(int[] input,int width,int radix){
        for(int i=0;i<width;i++){
            radixSingleSort(input,i,radix);
        }
    }
    public static void radixSingleSort(int[] input,int position,int radix){
        int numItems=input.length;
        int [] countArray=new int[radix];
        for(int value:input){
            countArray[getDigit(value,position,radix)]++;
        }
        //for statbility as less than and more
        for(int j=1;j<radix;j++){
            countArray[j]+=countArray[j-1];
        }
        int[] temp=new int[numItems];
        for(int tempIndex=numItems-1;tempIndex>=0;tempIndex--){
            //prefix -- is used to get exact where the position is as stating with 0
            temp[--countArray[getDigit(input[tempIndex],position,radix)]]=
                    input[tempIndex];
        }
        System.arraycopy(temp,0,input,0,numItems);
    }
    public static int getDigit(int value,int position,int radix){
        return value/(int)Math.pow(radix,position)%radix;
    }
}
