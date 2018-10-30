package com.company.insertionsort;

public class Main {

    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};
        //insertionsort(intArray,1);
        insertionsorts(intArray,intArray.length);
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
    public static void insertionsort(int[] input,int firstunboundedIndex){
        if(firstunboundedIndex==input.length){
            return;
        }
        else{
            int k=input[firstunboundedIndex];
            int j=firstunboundedIndex;
            while(j>0 && input[j-1]>k){
                input[j]=input[--j];
            }
            input[j]=k;
            System.arraycopy(input,0,input,0,input.length);
            insertionsort(input,++firstunboundedIndex);
        }
    }
    public static void insertionsorts(int[] input,int numItems){
        if(numItems<2){
            return;
        }
        insertionsorts(input,numItems-1);
        int k=input[numItems-1];
        int j;
        for(j=numItems-1;j>0 && input[j-1]>k;j--){
            input[j]=input[j-1];
        }
        input[j]=k;
    }
}
