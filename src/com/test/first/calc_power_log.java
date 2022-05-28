package com.test.first;

public class calc_power_log {

    public static void main(String[] args) {
       int c= calpower(2,5);
        System.out.println(c);
    }

    public static int calpower(int x, int n){

        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n%2==0){
            return calpower(x,n/2) * calpower(x,n/2);
        }else{
            return calpower(x, n/2) * calpower(x,n/2)*x;
        }


    }
}
