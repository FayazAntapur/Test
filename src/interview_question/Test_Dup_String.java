package interview_question;
import java.util.*;

public class Test_Dup_String {
    public static void main(String[] args) {
        testduplicate("Fayazz");
    }

    public static void testduplicate(String str){

        if(str.isEmpty()){
            System.out.println("string is empty");
            return;
        }
        if(str == null){
            System.out.println("sting is null");
            return;
        }
        if(str.length()==1){
            System.out.println("single char string");
            return;
        }

        char a[] = str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:a){
            if(map.get(c)==null){
                map.put(c,1);
            }else {
                map.put(c, map.get(c)+1);
            }
        }

        Set<Map.Entry<Character,Integer>> f = map.entrySet();
        for(Map.Entry<Character,Integer> e:f){
            //if(e.getValue()>1){
                System.out.println(e.getKey() +" "+e.getValue());
            //}
        }
    }
}
