package interview_question;

public class CalculatePercentage {

    public static void main(String[] args) {

        int uppercase=0;
        int lowercase=0;
        int digit=0;
        int spec=0;
        String s = "Fayaz Auotmation Labs 234";
        for(int i=0;i<s.length();i++){
        if(Character.isUpperCase(s.charAt(i))){
            uppercase++;
        }else if(Character.isLowerCase(s.charAt(i))){
            lowercase++;
        }else if(Character.isDigit(s.charAt(i))){
            digit++;
        }else {
            spec++;
        }
        }
        System.out.println(uppercase +" "+lowercase+" "+digit+" "+spec);
        System.out.println((uppercase*100)/s.length());
        System.out.println((lowercase*100)/s.length());
        System.out.println((digit*100)/s.length());
        System.out.println((spec*100)/s.length());
    }
}
