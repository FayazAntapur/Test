package interview_question;

public class RemoveJunk {

    public static void main(String[] args) {

        String s = "sdfgsdhkfg7t434*(*(*&)-_";

        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        long i = s.chars().filter(value -> (char)value=='s').count();
        System.out.println(i);
    }
}
