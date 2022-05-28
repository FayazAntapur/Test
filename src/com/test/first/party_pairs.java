package com.test.first;

public class party_pairs {

    public static void main(String[] args) {

        System.out.println(pair(4));
    }

    public static int pair(int num){

        if(num<=1){
            return 1;
        }
        //call single
        int one =  pair(num-1);

        int pais = (num-1) * pair(num-2);

        return one+pais;
    }
}
