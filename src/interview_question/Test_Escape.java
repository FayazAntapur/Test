package interview_question;

public class Test_Escape {

    public static void main(String[] args) {
        String s = "/\"Hello\"/";
        System.out.println(s);
        String s1 = "\"/\'Hello\'/\"";
        System.out.println(s1);
        String s2 = "\"Hello\"";
        System.out.println(s2);
        String s3 = "I love \"Java\" and \"programming\" and \"movies\"";
        System.out.println(s3);
        String s4 = "\'I love \"Java\" and \"programming\" and \"movies\"\'";
        System.out.println(s4);
        String path = "//input[@id='"+s4+"']";
        System.out.println(path);
    }
}
