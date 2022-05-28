package come.core.java.one;

import java.util.TreeMap;

public class test_treemap {

    public static void main(String[] args) {

        TreeMap<Integer, String > tm = new TreeMap<>();
        tm.put(45,"abc");
        tm.put(34,"xyz");
        tm.put(35,"pqr");
        System.out.println(tm);
    }
}
