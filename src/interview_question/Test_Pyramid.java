package interview_question;

public class Test_Pyramid {
    public static void main(String[] args) {

        int lines=5;
        int star=1;
        int space=5;
        for (int i=1;i<=lines;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++){
                System.out.print("* ");
            }
            star++;
            space--;
            System.out.println();
        }
        star =4;
        space =2;
        for (int i=1;i<=lines;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++){
                System.out.print("* ");
            }
            star--;
            space++;

            System.out.println();
        }

    }
}
