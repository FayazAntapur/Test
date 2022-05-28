package com.test.first;

import java.util.*;

public class remdup {

    public static void main(String[] args) {

        int[] a = {3,4,5,67,2,3,78,55,44,77,65,43,76,77};
        HashSet<Integer> hs = new LinkedHashSet<>();
        for (int a1:a){
            hs.add(a1);
        }
        System.out.println(hs);
    }
}
