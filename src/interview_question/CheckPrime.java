package interview_question;

public class CheckPrime {

    public static void main(String[] args) {

        boolean flag =true;
        int num = 6;
        for(int i=2;i<num;i++){

            if(num%i==0){
                System.out.println("number is not prime");
                flag = false;
                break;
            }

        }
        if(flag){
            System.out.println("number is prime");
        }



    }
}
