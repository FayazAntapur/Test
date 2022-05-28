package interview_question;

public class Test_Leader_Element {

    public static void main(String[] args) {
        int a[] = {8,7,12,9,8,3};
        //int a[] = {92,10,9,8,7,14};
        int max = a[a.length-1];
        System.out.println(max);
        for(int i =a.length-2;i >=0;i--){

            if(a[i] > max){
                System.out.println(a[i]);
                max=a[i];
            }
        }
    }
}
