package interview_question;

public class test_py {
    public static void main(String[] args) {
        int lines =5;
        int star = 1;
        int space = 5;
        for (int i=1;i<=lines;i++){
            for (int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=star;j++){
                System.out.print("* ");
            }
            star++;
            space--;
            System.out.println();
        }
        star = 5;
        space = 1;
        for (int i=1;i<=lines;i++){
            for (int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=star;j++){
                System.out.print("* ");
            }
            star--;
            space++;
            System.out.println();
        }

    }
}
