package interview_question;

import java.util.Scanner;

public class Mat_Multiplication {

    public static void main(String[] args) {

        System.out.println("Matrix multiplication");
        Scanner sc= new Scanner(System.in);

        System.out.println("enter 1 st matrix rows and columns");
        int fRows =sc.nextInt();
        int fCols = sc.nextInt();

        System.out.println("enter 2 st matrix rows and columns");
        int sRows =sc.nextInt();
        int sCols = sc.nextInt();

        if(fCols == sRows) {

            int matrix1[][] = new int[fRows][fCols];
            int matrix2[][] = new int[sRows][sCols];
            int product[][] = new int[fRows][sCols];

            System.out.println("enter 1 st matrix data");
            for (int i = 0; i < fRows; i++) {
                for (int j = 0; j < fCols; j++) {
                        matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("enter 2 nd matrix data");
            for (int i = 0; i < sRows; i++) {
                for (int j = 0; j < sCols; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }

            System.out.println("matrix 1 is : ");
            for(int i=0;i<fRows;i++){
                for(int j=0;j<fCols;j++){
                    System.out.print(matrix1[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.println("matrix 2 is : ");
            for(int i=0;i<sRows;i++){
                for(int j=0;j<sCols;j++){
                    System.out.print(matrix2[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.println("matrix multiplication is : ");
            for(int i=0;i<fRows;i++){
                for(int j=0;j<sCols;j++){
                    for(int k =0;k<sRows;k++){
                        product[i][j]+= matrix1[i][k]*matrix2[k][j];
                    }
                }

            }
            System.out.println("matrix 2 is : ");
            for(int i=0;i<fRows;i++){
                for(int j=0;j<sCols;j++){
                    System.out.print(product[i][j]+"\t");
                }
                System.out.println();
            }


        }

    }
}
