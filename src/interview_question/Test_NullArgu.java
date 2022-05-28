package interview_question;

public class Test_NullArgu {

    public static void main(String[] args) {
        test(null);
    }

    public static void test(Object o){
        System.out.println("object");
    }
    public static void test(String o){
        System.out.println("String");
    }
    //public static void test(StringBuffer o){
    //    System.out.println("StringBuffer");
    //}

}
