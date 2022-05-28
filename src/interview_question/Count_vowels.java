package interview_question;

import java.util.function.IntPredicate;

public class Count_vowels {

    public static boolean isVowel(char t){

        return t ==  'a'|| t ==  'e'|| t ==  'i'|| t ==  'o'|| t ==  'u'||
                t ==  'A'|| t ==  'E'|| t ==  'I'|| t ==  'O'|| t ==  'U';
    }
    public static void main(String[] args) {

        String s = "Testing";
        int count = 0;
        for(char c:s.toCharArray()){
            boolean b = isVowel(c);
            if(b){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Java Stream");

        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int t) {

                return t ==  'a'|| t ==  'e'|| t ==  'i'|| t ==  'o'|| t ==  'u'||
                        t ==  'A'|| t ==  'E'|| t ==  'I'|| t ==  'O'|| t ==  'U';
            }
        };
        long l = s.chars().filter(vowel).count();
        System.out.println(l);
    }
}
