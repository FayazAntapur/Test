package interview_question;

public class Test_Num_Star {
    public static void main(String[] args) {
        int lines=5;
        int num=1;
        int nums=65;
        for (int i=1;i<=lines;i++){
            for(int j=0;j<num;j++){
                System.out.print((char)(nums)+" ");

            }
            num++;
            nums++;
            System.out.println();
        }
    }
}
