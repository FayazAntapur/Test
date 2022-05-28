package interview_question;

public class MaxInArray {

    public static void main(String[] args) {

        int a[] = {45,23,67,2,13};
        int max = a[0];
        for(int i = 1;i<a.length;i++){

            if(a[i] >max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
