package interview_question;

public class Test_String {

    public static void main(String[] args) {
        String s = new String("fayaz");
        //string object and string constant pool
        //Heap stack
        //in heap there is string constant pool
        String s1 = new String("fayaz");
        String s2 = "fayaz";
        String s3 = "fayaz";
        String s4 = s3;
    }
}
