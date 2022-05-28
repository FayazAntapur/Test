package com.test.first;

public class place_tiles {

    public static void main(String[] args) {
        int v = placetiles(4,2);
        System.out.println(v);
    }

    public static int placetiles(int n, int m){

        if(n <m){
            return 1;
        }
        if(n==m){
            return 2;
        }

        int v =  placetiles(n-m,m);

        int h = placetiles(n-1,m);
        return v + h;
    }
}
