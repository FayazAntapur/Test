package com.test.first;

import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int mat[][] = new int[rows][columns];

        for (int i=0;i<rows;i++){

            for (int j=0;j<columns;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("printing matrix");

        for (int k=0;k<rows;k++){
            for(int l=0;l<columns;l++){
                System.out.print(mat[k][l]+" ");
            }
            System.out.println();
        }

        System.out.println("find index of number");
        int x = sc.nextInt();

        for (int k=0;k<rows;k++){
            for(int l=0;l<columns;l++){
                if(mat[k][l] ==x){
                    System.out.println(k+","+l);
                }
            }
        }

    }
}
