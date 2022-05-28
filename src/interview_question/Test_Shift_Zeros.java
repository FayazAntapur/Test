package interview_question;

import java.util.Arrays;

public class Test_Shift_Zeros {

    public static void main(String[] args) {
        int i[] = new int[]{1,0,2,0,3,0,0,0};
        int count=0;
        int i1[]= new int[i.length];
        for(int number: i){
            if(number !=0){
                i1[count]=number;
                count++;
            }
        }
        System.out.println(Arrays.toString(i1));

    }
}
