package interview_question;

public class CountCapital {

    public static void main(String[] args) {

        String str = "FayazAntaputWorkingInHsbc";
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >='A' && str.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);

        int count2 = 0;
        for(int i=0; i <str.length();i++){

            if(Character.isUpperCase(str.charAt(i))){
                count2++;
            }
        }
        System.out.println("count2 "+count2);

        long l = str.chars().filter(e -> e >='A' && e<='Z').count();
        System.out.println(l);
    }
}
