package interview_question;

import java.util.StringJoiner;

public class TestStringJoiner {

    public static void main(String[] args) {

        //Fayaz, Antapur, HSBC
        StringJoiner joiner = new StringJoiner(",", "[","]");
        joiner.add("Fayaz").add("Antpur").add("HSBC");
        System.out.println(joiner);
    }
}
