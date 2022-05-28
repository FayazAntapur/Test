package com.test.first;

public class sum_natual_num {
    static int sum =0;
    public static void main(String[] args) {


        int s = sum_natural_numbers(5);
        System.out.println(s);
    }

    public static int sum_natural_numbers(int num){

        if(num ==0){
            return sum;
        }


        sum +=num;
        sum_natural_numbers(num-1);
        return sum;
    }
}
