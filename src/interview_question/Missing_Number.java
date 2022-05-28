package interview_question;

public class Missing_Number {

    public static void main(String[] args) {

        int a[] = {1,2,3,4};
        int sum =0;
        for(int i: a){
            sum+=i;
        }
        int expectes = (5 * (5+1))/2;
        System.out.println(sum);
        System.out.println(expectes - sum);
    }
}
