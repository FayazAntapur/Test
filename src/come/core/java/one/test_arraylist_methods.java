package come.core.java.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test_arraylist_methods {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("fayaz");
        al.add("virat");
        al.add("sourav");
        al.add("rahul");
        System.out.println("normal al "+al);
        ArrayList<Integer> ali = new ArrayList<>(Arrays.asList(45,87,9,234,123,1,43));
        System.out.println("array list integer "+ali);
        ArrayList<Integer> ali2 = new ArrayList<>();
        ali2.addAll(ali);
        System.out.println("add all list "+ali2);
        ali2.clear();
        System.out.println("clear array ali2"+ali2);
        System.out.println(ali.lastIndexOf(1));

        ArrayList alclone = new ArrayList();
        alclone.add(al.clone());
        System.out.println(alclone);

        ArrayList clone2 = (ArrayList)ali.clone();
        System.out.println(clone2);
        System.out.println(al.contains("fayaz"));
        System.out.println(al.contains("Asdasd"));
        System.out.println(al.indexOf("fayaz"));
        System.out.println(al.indexOf("rahul")>1);

        ArrayList<Integer> als =  new ArrayList<>(Arrays.asList(445,56,345,234,56));
        System.out.println(als.lastIndexOf(56));
        //als.remove(1);
        System.out.println(als);
        al.remove("rahul");
       // als.remove(Integer.parseInt("345"));
        System.out.println(al);
        als.removeIf(num ->num%2!=0);
        System.out.println(als);
        als.retainAll(Collections.singleton(56));
        System.out.println(als);
        ArrayList<Integer> als1 =  new ArrayList<>(Arrays.asList(445,56,345,234,56,456));
        als1.subList(4,6);
        System.out.println(als1.subList(4,6));
        Collections.synchronizedList(al);
    }
}
