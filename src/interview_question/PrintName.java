package interview_question;

public class PrintName {
    public static void main(String[] args) {

        name("fayaz");

    }

    static int count=0;
    public static void name(String n){
        count++;
        if(count <=100){
            System.out.println(n + count);
            name(n);
        }

    }
}
