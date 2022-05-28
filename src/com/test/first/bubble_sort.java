package com.test.first;

public class bubble_sort {

    public static void main(String[] args) {

        int b[] = {7,8,3,1,2};
        for(int k=0;k< b.length-1;k++) {
            for (int i = 0; i < b.length -k- 1; i++) {

                if (b[i] > b[i + 1]) {
                    int temp = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = temp;
                }
            }
        }

        for (int ele:b){
            System.out.println(ele);
        }
    }
}
