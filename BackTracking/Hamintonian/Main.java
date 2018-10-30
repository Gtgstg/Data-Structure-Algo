package com.company.backtracking;

public class Main {

    public static void main(String[] args) {
        int b[][]={
                {0,1,1,1,0,0},
                {1,0,1,0,1,1},
                {1,1,0,1,0,1},
                {1,0,1,0,0,1},
                {0,1,0,0,0,1},
                {0,1,1,1,1,0}
    };
    //int[][] b={{0,1,0},{1,0,1},{0,1,0}};
        Hamiltonian a=new Hamiltonian(b);
        a.solve();
    }
}
