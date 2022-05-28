package interview_question;

import java.util.Scanner;

public class Create_Matrix {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();

        System.out.println("Enter columns");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        System.out.println("enter matrix data");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix presentation");
        for(int k=0;k<rows;k++){
            for(int j=0;j<cols;j++){
                System.out.print(a[k][j]+"\t");
            }
            System.out.println();
        }
    }
}
