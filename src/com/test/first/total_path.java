package com.test.first;

public class total_path {

    public static void main(String[] args) {
        //move right
        //move down

        System.out.println(findpath(0,0,3,3));
    }

    public static int findpath(int i, int j,int n, int m){

        if(n==i ||m==j){
            return 0;
        }
        if(i == n-1 && j==m-1){
            return 1;
        }

        //move down
        int downpath = findpath(i+1,j,n, m);
        //move right
        int rightpath = findpath(i, j+1,n,m);

        return downpath+rightpath;
    }
}
