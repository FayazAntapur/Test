package interview_question;

import java.util.Scanner;

public class Matrix_Add_Sub {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();

        System.out.println("enter columns");
        int cols = sc.nextInt();

        int matrix1[][] = new int[rows][cols];
        int matrx2[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        System.out.println("enter 1 st matrix data");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter 2 nd matrix data");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrx2[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j] = matrix1[i][j] + matrx2[i][j];
            }
        }
        System.out.println("1st matrix is");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("2nd matrix is");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrx2[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("sum of matrix is");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
