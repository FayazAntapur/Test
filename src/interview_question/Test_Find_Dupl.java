package interview_question;

import java.util.*;

public class Test_Find_Dupl {

    public static void main(String[] args) {

        String s1[] = {"Amazon","GCP","Azure","Amazon","Alibaba","Amazon","GCP", "GCP"};
        /*Map<String, Integer> hm = new HashMap<String,Integer>();
        for(String e: s1){
            if(hm.get(e)==null){
                hm.put(e,1);
            }else {
                hm.put(e,hm.get(e)+1);
            }
        }

        Set<Map.Entry<String,Integer>> s= hm.entrySet();
        for(Map.Entry<String ,Integer> entry:s){
            if(entry.getValue() >1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }*/


        Set<String> set = new HashSet<String>();
        Set<String> set1 = new HashSet<String>();
        for(String sd: s1){
            if(set.add(sd) == false){
                set1.add(sd);
            }
        }
        System.out.println(set1);

    }
}
