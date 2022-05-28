package interview_question;

public class Test_Obj_Count {
    static  int i=0;
    {
        i++;
    }
    public static void main(String[] args) {
        Test_Obj_Count s = new Test_Obj_Count();
        Test_Obj_Count s1 = new Test_Obj_Count();
        System.out.println(i);
    }
}
