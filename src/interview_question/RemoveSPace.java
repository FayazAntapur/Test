package interview_question;

public class RemoveSPace {
    public static void main(String[] args) {

        String s = "   Fayaz dfr   ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ", ""));
        String []s1 = s.split(" ");
        for (String s2:s1){
            if(!s2.isBlank()){
            System.out.print(s2);}
        }

    }
}
