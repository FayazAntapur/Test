package interview_question;

import javax.management.MBeanRegistration;

public class PrimePrime {

    public static void main(String[] args) {
        int num = 20;
        boolean flag =true;
        for (int i=0;i<num;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
            flag =true;
        }
    }
}
