package come.core.java.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test_hashmap_create {


    public static void main(String[] args) {

        Map<Integer, String> hm = Map.of();
        //hm.put(34,"#4");
        System.out.println(hm);

        Map<Integer, String > ohm = Map.of(1234,"sdf");
        System.out.println(ohm);
        //ohm.put(342,"dfsd");

        Map<Integer, String > mhm= Map.of(1,"virat",2,"rohit",3,"rishab");
        System.out.println(mhm);
        //4mhm.put(23,"shami");

        Iterator itr = mhm.entrySet().iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
