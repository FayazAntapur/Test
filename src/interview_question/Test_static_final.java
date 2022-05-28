package interview_question;

public class Test_static_final {

    public static void main(String[] args) {
        System.out.println(one.k);
        //System.out.println(one.k1);
    }
}

class one{

    public static final int k = 10;
    public static int k1 = 10;
    static{
        System.out.println("this is static block");
    }
}