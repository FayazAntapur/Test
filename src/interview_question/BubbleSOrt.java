package interview_question;

import java.util.Arrays;

public class BubbleSOrt {
    public static void main(String[] args) {
        int a[] = {12,43,23,56,6,10};
        System.out.println(Arrays.toString(a));
        for(int i = 0;i <a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] =temp;

                }
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
}
