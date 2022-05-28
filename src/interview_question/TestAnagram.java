package interview_question;

import java.util.Arrays;

public class TestAnagram {

    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "ACT ";

        s1 =s1.replaceAll("\\s","");
        s2 = s2.replaceAll("\\s","");

        if(s1.length() !=s2.length()){
            System.out.println("not anagram");
        }else {
            char [] c1= s1.toCharArray();
            char [] c2= s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(c1);
            System.out.println(c2);
            if(Arrays.equals(c1, c2)){
                System.out.println("anagrma");
            }else {
                System.out.println("not");
            }
        }


    }
}
