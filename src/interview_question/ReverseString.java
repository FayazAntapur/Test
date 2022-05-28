package interview_question;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Fayaz automation labs";
        String app = "";
        for(int i = s.length()-1;i>=0;i--){
            app=app+s.charAt(i);
        }
        System.out.println(app);
    }
}
