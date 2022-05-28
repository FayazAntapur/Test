package interview_question;

public class Test_Star {
    public static void main(String[] args) {
        int lines=5;
        int star =5;
        /*for(int i=1;i<=lines;i++){
            for(int j =1;j <=star;j++){
                System.out.print("*");
            }
            star++;
            System.out.println();
        }*/

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            star--;
            System.out.println();
        }
    }
}
