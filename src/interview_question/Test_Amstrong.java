package interview_question;

public class Test_Amstrong {

    public static void main(String[] args) {

        int num =153;
        int copynum = num;
        int len=0;
        int sum=0;
        while(num >0){
            num=num/10;
            len++;
        }
        System.out.println("lengh is : "+len);

        while (copynum>0){
            int rem = copynum%10;
            int mul=1;
            for(int i=0;i <len;i++){
                mul=mul*rem;
            }
            sum+=mul;
            copynum=copynum/10;

        }
        System.out.println(sum);
    }


}
