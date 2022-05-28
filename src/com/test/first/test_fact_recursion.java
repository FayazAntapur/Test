package com.test.first;

public class test_fact_recursion {

    public static void main(String[] args) {

        int i = fact(5);
        System.out.println(i);
    }

    public static int fact(int num){
        if(num==1){
            return 1;
        }

        int facts = fact(num-1);
        int product = num * facts;
        return product;

    }
}
