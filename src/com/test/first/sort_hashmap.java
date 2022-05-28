package com.test.first;

import java.util.*;
import java.util.stream.Collectors;

public class sort_hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Java", 98);
        hm.put("Python", 76);
        hm.put("C++", 87);

        System.out.println(hm);
        Map<String,Integer> lhs = new LinkedHashMap<>();
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(s ->lhs.put(s.getKey(), s.getValue()));
        System.out.println("comparing  by key");
        System.out.println(lhs);
        Map<String, Integer> lhs1 = new LinkedHashMap<>();
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(s1->lhs1.put(s1.getKey(), s1.getValue()));
        System.out.println("comparing by value");
        System.out.println(lhs1);
        System.out.println("comparing  by value reverse order");
        Map<String,Integer> lhm2 = new LinkedHashMap<>();
        hm.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEachOrdered(s2->lhm2.put(s2.getKey(),s2.getValue()));
        System.out.println(lhm2);
        System.out.println("2nd approch");
        Map<String, Integer> finalmap = hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue,(oldvale,newvalue)->oldvale,LinkedHashMap::new));
        System.out.println(finalmap);


        List<Map.Entry<String,Integer>> list =  new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<String,Integer> rhm = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> ele:list){
            rhm.put(ele.getKey(), ele.getValue());
        }


    }
}
