package com.company.mergesort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergesort(intArray,0,intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }
    public static void mergesort(int[] input,int start,int end){
        if(end-start<2) {
            return;
        }
        else{
            int mid=(start+end)/2;
            mergesort(input,start,mid);
            mergesort(input,mid,end);
            merge(input,start,mid,end);
        }
    }
    public static void merge(int[] input,int start,int mid,int end){
        //optimize if final of left is small then initial of right thn no need and alsefor inplace.
        if(input[mid-1]<=input[mid]){
            return;
        }
        else{
            int i=start;
            int j=mid;
            int tempindex=0;
            int[] temp=new int[end-start];
            //for optimize as if on is finish we hav to stop because it will be copied at its exact position.
            while(i<mid && j<end){
                // nice use of++ inplace concept
                temp[tempindex++]=input[i]<=input[j] ? input[i++] : input[j++];
            }
            //source start des start how many to copy
            System.arraycopy(input,i,input,start+tempindex,mid-i);
            System.arraycopy(temp,0,input,start,tempindex);
        }
    }
}

