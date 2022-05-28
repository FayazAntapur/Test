package interview_question;

public class FindSum {
    public static void main(String[] args) {

        int num=34556;
        int sum=0;
        while (num >0){

            int rem = num %10;
            sum+=rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
