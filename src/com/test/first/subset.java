package com.test.first;

import java.util.ArrayList;

public class subset {

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> ss = new ArrayList<>();
        chekcsubset(3,ss);

    }

    public static void chekcsubset(int n, ArrayList<Integer> sub){

        if(n==0){
            printsub(sub);
            return;
        }

        sub.add(n);
        chekcsubset(n-1, sub);

        sub.remove(sub.size()-1);
        chekcsubset(n-1,sub);
    }

    public static void printsub(ArrayList<Integer> list){
        for(int ele:list){
            System.out.print(ele);
        }
        System.out.println();
    }
}
