package com.company.coinchange;

public class CoinChange {
    public int naive(int M,int[]v,int index){
        if(M<0){
            return 0;
        }
        if(M==0){
            return 1;
        }
        if(v.length==index){
            return 0;
        }
        return naive(M-v[index],v,index)+naive(M,v,index+1);
    }
    public int DP(int M,int[] v){
        int [][] dpTable=new int[v.length+1][M+1];
        for(int i=0;i<=M;i++){
            dpTable[0][i]=0;
        }
        for(int i=0;i<=v.length;i++){
            dpTable[i][0]=1;
        }
        for(int i=1;i<=v.length;i++){
            for(int j=1;j<=M;j++){
                if(v[i-1]<=j){
                    dpTable[i][j]=dpTable[i-1][j]+dpTable[i][j-v[i-1]];
                }
                else{
                    dpTable[i][j]=dpTable[i-1][j];
                }
            }
        }
        return dpTable[v.length][M];
    }
}
