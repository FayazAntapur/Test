package com.test.first;

public class missing {

    public static void main(String[] args) {
        int[] a ={1,2,4,5};
        int n=5;

        int num = n*(n+1)/2;
        int smu=0;
        for(int ele: a){
            smu+=ele;
        }
        System.out.println(smu);
        System.out.println(num);
    }
}
