package interview_question;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Test_Average {

    public static void main(String[] args) {
        int a[] = {3,5,7,9,0};
        int sum = 0;
        int avg;
        for(int i:a){
            sum = sum+i;
        }
        avg = sum/a.length;
        System.out.println(avg);
        OptionalDouble od = Arrays.stream(a).average();
        System.out.println(od.getAsDouble());
    }
}
