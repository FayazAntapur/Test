package interview_question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FInd_lenght {

    public static void main(String[] args) {

        String s = "testing dfgdg";

        System.out.println(s.toCharArray().length);
        System.out.println(s.lastIndexOf(""));
        Matcher m = Pattern.compile("$").matcher(s);
        m.find();
        System.out.println(m.end());
        int count =0;
        for(char c: s.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
