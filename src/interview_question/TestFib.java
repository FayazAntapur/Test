package interview_question;

public class TestFib {

    public static void main(String[] args) {

        int a=0;
        int b =1;
        int sum=0;
        System.out.println(a +"\n"+b);
        for(int i=0;i <8;i++){

            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);

        }

    }
}
