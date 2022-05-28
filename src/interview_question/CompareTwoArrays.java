package interview_question;

public class CompareTwoArrays {
    public static void main(String[] args) {
        boolean flag = true;
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};
        if(a.length ==b.length){
            System.out.println("equal");
            for(int i =0;i<a.length;i++){
                if(a[i] != b[i]){
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("array are equal");
        }
    }
}
