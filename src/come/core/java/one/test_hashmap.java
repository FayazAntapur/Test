package come.core.java.one;

import java.util.HashMap;
import java.util.Iterator;

public class test_hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(45,"fayaz");
        hashMap.put(45,"ravi");
        hashMap.put(56,"abhi");
        hashMap.put(78,"zaheer");
        hashMap.put(23,"umaran");
        System.out.println(hashMap);

        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
