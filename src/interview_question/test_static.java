package interview_question;

public class test_static {

    static {
        System.out.println("fayaz");
    }

    private test_static(){
        System.out.println("initializing");
    }
    {
        System.out.println("this is instance block");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        test_static s =  new test_static();
    }
}
