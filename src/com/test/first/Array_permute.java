package com.test.first;

import java.util.ArrayList;
import java.util.List;

public class Array_permute {

    public static void main(String[] args) {

        int a[] = {1,2,3};
        List<List<Integer>> list1 =permute(a);
        System.out.println(list1);
    }

    public static List<List<Integer>> permute(int nums[]){

        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, nums, 0);
        return list;
    }

    public static void backtrack(List<List<Integer>> result, int a[], int start){
        if(start == a.length){
            result.add(tolist(a));
        }else {
            for (int i=start;i <a.length;i++){

                swap(i, start, a);
                backtrack(result, a, start+1);
                swap(i, start, a);
            }
        }
    }

    public static void swap(int i, int j, int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static List<Integer> tolist(int a[]){
        List<Integer> l1 = new ArrayList<>();
        for (int i:a){
            l1.add(i);
        }
        return l1;
    }


}
