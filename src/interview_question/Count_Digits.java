package interview_question;

import java.util.HashMap;

public class Count_Digits {

    public static void main(String[] args) {

        int num =1234123;
        HashMap<Integer, Integer> hm  =new HashMap<Integer,Integer>();
        while (num >0){

            int a = num%10;
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }else {
                hm.put(a,1);
            }
            num =num/10;

        }
        System.out.println(hm);

    }
}
