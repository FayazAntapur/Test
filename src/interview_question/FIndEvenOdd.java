package interview_question;

public class FIndEvenOdd {

    public static void main(String[] args) {
        int num = 1234567;

        while (num>0){
            int rem = num%10;
            if(rem%2==0){
                System.out.println(rem+" is even");
            }else {
                System.out.println(rem+" is odd");
            }
            num = num/10;
        }
    }
}
