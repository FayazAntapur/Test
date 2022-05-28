package interview_question;

public class CheckSubString {

    public static void main(String[] args) {

        boolean b = checkSub("My name is fayaz", "faz");
        System.out.println(b);
    }

    public static boolean checkSub(String str, String sub){

        return str.contains(sub);
    }
}
