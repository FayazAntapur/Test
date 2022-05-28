package com.test.first;

public class sum_add_natural {
    public static void main(String[] args) {

        add_recursion(1,15,0);
    }

    public static void add_recursion(int i, int n, int sum){
        if(i==n){
            sum = sum+i;
            System.out.println(sum);
            return;
        }

        sum +=i;
        add_recursion(i+1,n,sum);
    }
}
