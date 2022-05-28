package interview_question;

public class Test_StrI_to_nt {
    public static void main(String[] args) {

        String s = "123";
        int j = Integer.parseInt(s);
        System.out.println(j);

        int num = 0;
        for(int i=0;i<s.length();i++){
            num = num *10+ (int) s.charAt(i)-48;

        }
        System.out.println(num+10);

    }
}
