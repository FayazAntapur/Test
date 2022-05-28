package com.test.first;

public class selection_sort {

    public static void main(String[] args) {

        int a[] = {7,8,3,1,2};

        for(int i=0;i<a.length-1;i++){
            int small = i;
            for (int j= small+1;j<a.length;j++){

                if(a[small] >a[j]){
                    small = j;
                }
            }
            int temp =a[small];
            a[small] = a[i];
            a[i] = temp;

        }
        for (int ele: a){
            System.out.println(ele);
        }
    }
}
