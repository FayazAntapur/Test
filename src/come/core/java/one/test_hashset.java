package come.core.java.one;

import java.util.HashSet;
import java.util.Iterator;

public class test_hashset {

    public static void main(String[] args) {

        //when you are creating hashset object internally it creates hashmap with variable PRESENT
        HashSet<String> s = new HashSet<>();
        s.add("salah");
        s.add("messi");
        s.add("lukaku");
        System.out.println(s);
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
