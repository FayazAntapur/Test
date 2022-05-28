package interview_question;

import java.util.HashSet;
import java.util.Map;

public class Test_Count_Ocuurences {

    public static void main(String[] args) {

        String s = "Selenium Webdriver Automation";
        long count =s.chars().filter(value -> (char)value=='i' || (char)value =='W').count();
        System.out.println(count);
        long l = countchar(s, 't');
        System.out.println(l);
    }

    public static long countchar(String s, char c){

        return s.chars().filter(value -> (char)value==c).count();
    }

}
