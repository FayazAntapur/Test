package interview_question;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverseNumber(123));
        reverseRecursive(560);

    }
    public static int reverseNumber(int num){
        int temp=0;
        while(num> 0){

            int rev = num%10;
            temp = rev+temp*10;
            //System.out.print(rev);
            num = num/10;
        }
        return temp;
    }
    public static void reverseRecursive(int num){

        if(num <10){
            System.out.print(num);
            return;
        }else {
            System.out.print(num%10);
            reverseRecursive(num/10);
        }
    }
}
