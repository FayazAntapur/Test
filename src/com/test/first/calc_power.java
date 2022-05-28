package com.test.first;

public class calc_power {
    public static void main(String[] args) {

        int ans = calcpower(2,5);
        System.out.println(ans);
    }

    public static int calcpower(int x, int n){

        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int cal_p = calcpower(x,n-1);
        int powers = x * cal_p;
        return powers;

    }
}
