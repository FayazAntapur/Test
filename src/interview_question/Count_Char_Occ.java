package interview_question;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Count_Char_Occ {

    public static void main(String[] args) {
        countChar(" fayaz ");
    }

    public static void countChar(String s){

        Map<Character, Integer> hm = new HashMap<Character,Integer>();
        char c[] = s.toCharArray();
        for(char c1:c){
            if(!String.valueOf(c1).isBlank()) {
                if (hm.containsKey(c1)) {
                    hm.put(c1, hm.get(c1) + 1);
                } else {
                    hm.put(c1, 1);
                }
            }
        }
        System.out.println(hm);

        Set<Map.Entry<Character, Integer>> s1 = hm.entrySet();
        for(Map.Entry<Character,Integer> e:s1){
            //System.out.println(e.getKey() + " "+ e.getValue());
            if(e.getValue() >1){
                System.out.println(e.getKey());
            }
        }

    }
}
