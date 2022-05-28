package interview_question;

public class MaxMinNumber {

    public static void main(String[] args) {

        int a = 56;
        int b = 59;
        int c = 57;

        if(a >b && a >c){
            System.out.println("a is max");
        }else if(b >a && b>c){
            System.out.println("b is max");
        }else {
            System.out.println("c is max");
        }

    }
}
