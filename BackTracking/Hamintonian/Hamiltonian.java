package com.company.backtracking;
public class Hamiltonian {
    private int numvertices;
    private int[] hampath;
    private int[][] adjacencymatrix;
    public Hamiltonian(int[][] adjacencymatrix){
        this.adjacencymatrix=adjacencymatrix;
        this.hampath=new int[adjacencymatrix.length];
        this.numvertices=adjacencymatrix.length;
        this.hampath[0]=0;
    }
    public void solve(){
        if(findFeasible(1)){
            showHamPath();
        }
        else{
            System.out.println("Not Feasible Solution");
        }
    }
    public void showHamPath(){
        System.out.print("Hamiltonian Cycle:");
        for(int i=0;i<hampath.length;i++){
            System.out.print(hampath[i]+" ");
        }
        System.out.print(hampath[0]);
    }
    public boolean findFeasible(int position){
        if(position==numvertices){
            if(adjacencymatrix[hampath[position-1]][hampath[0]]==1) {
                return true;
            }
            else
                return false;
        }
        for(int i=1;i<numvertices;++i){
            if(isfeasible(i,position)){
                hampath[position]=i;
                if(findFeasible(position+1)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isfeasible(int index,int pos){
        if(adjacencymatrix[hampath[pos-1]][index]==0){
            return false;
        }
        for(int i=0;i<pos;i++) {
            if (hampath[i] == index) {
                return false;
            }
        }
        return true;
    }
}
