package com.test.first;

public class mergesort {

    public static void conqure(int[] arr, int si, int ei, int mid){
        int[] mergesort = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while (idx1 <=mid && idx2 <=ei){
            if(arr[idx1] <= arr[idx2]){
                mergesort[x++] = arr[idx1++];
            }else {
                mergesort[x++] = arr[idx2++];
            }
        }
        while (idx1 <=mid){
            mergesort[x++] = arr[idx1++];
        }
        while (idx2<=ei){
            mergesort[x++] = arr[idx2++];
        }

        for(int i=0,j=si;i<mergesort.length;i++,j++){
            arr[j] = mergesort[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){

        if(si >=ei){
            return;
        }

        int mid = si+(ei-si)/2;
        divide(arr, si,mid);
        divide(arr, mid+1, ei);
        conqure(arr, si, ei, mid);

    }
    public static void main(String[] args) {
        int a[] = {6,3,9,5,2,8};
        int n =a.length;
        divide(a, 0, n-1);
        for (int ele:a){
            System.out.println(ele);
        }

    }
}
