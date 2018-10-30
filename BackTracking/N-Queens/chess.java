package com.company.backtracking;

public class chess {
    private int[][] chess;
    private int queen;
    public chess(int queen){
        this.chess=new int[queen][queen];
        this.queen=queen;
    }
    public void solve(){
        if(set(0)){
            printChess();
        }
        else{
            System.out.println("No way");
        }
    }
    public void printChess(){
        for(int[] i:chess){
            for(int j:i){
                if(j==1)
                System.out.print("*");
                else{System.out.print("-");}
            }
            System.out.println();
        }
    }
    public boolean set(int col){
        if(col==queen){
            return true;
        }
        for(int i=0;i<queen;i++){
            if(validPlace(i,col)){
                chess[i][col]=1;
                if(set(col+1)){
                    return true;
                }
                chess[i][col]=0;
            }
        }
        return false;
    }
    public boolean validPlace(int row,int col){
        for(int i=0;i<col;i++){
            if(chess[row][i]==1){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1) {
                return false;
            }
        }
        for(int i=row,j=col;i<queen && j>=0;i++,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
