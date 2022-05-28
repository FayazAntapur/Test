package interview_question;

public class LinearSearch {

    public static void main(String[] args) {

        boolean flag = false;
        int a[] = {34, 45, 76, 231, 4, 9};
        int num = 23;
        for (int i = 0; i < a.length;i++) {

            if(a[i] == num){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }
    }
}
