package interview_question;

import java.util.stream.IntStream;

public class print_1_100_loop {
    public static void main(String[] args) {
        //printNum(1);
        IntStream.range(1,101).forEach(e -> System.out.println(e));
    }

    public static void printNum(int num){
        if(num <= 100){
            System.out.println(num);
            num++;
            printNum(num);
        }
    }
}
