package com.test.first;

public class fib_rec {

    public static void main(String[] args) {

        System.out.println(0);
        System.out.println(1);
        fib(0,1,8-2);
    }
    public static void fib(int a, int b,int num){

        if(num==0){
            return ;
        }
        int c = a+b;
        System.out.println(c);
        fib(b,c,num-1);

    }
}
