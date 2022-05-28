package com.test.first;

public class test_recursion {

    public static void main(String[] args) {

        test1(1);
    }

    public static void test1(int num){

        if(num <=5){
            System.out.println(num);
            num++;
            test1(num);
        }

    }
}
